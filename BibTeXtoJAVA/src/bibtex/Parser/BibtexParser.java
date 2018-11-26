package bibtex.Parser;

import bibtex.BibtexFile;
import bibtex.Entries.*;
import bibtex.Fields;
import bibtex.IBibtexElement;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class BibtexParser {

    public static BibtexFile parse(String path){
        BibtexFile bibtexFile = new BibtexFile();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null){
                if(line.startsWith("@")){

                    String[] splitted = line.split("[@{}=]");
                    String entry = splitted[1].replaceAll("\\s+","");
                    String key = splitted[2].replaceAll(",","");

                    switch(entry.toUpperCase()){
                        case "PREAMBLE":
                            break;
                        case "COMMENT":
                            break;
                        case "STRING":
                            bibtexFile.putString(key, splitted[4].replaceAll("\"","")); //splitted[3] jest spacją
                            break;
                        default:
                            Map<Fields, String> fields = new LinkedHashMap<>();
                            while((line = br.readLine()) != null && !line.equals("}")){

                                String[] split = line.split(" = ");
                                split[0] = split[0].replaceAll("\\s+","");
                                Fields field = Fields.valueOf(split[0].toUpperCase());
                                if(split[1].contains(" # ")){
                                    String[] splitHash = split[1].split(" # ");
                                    for(int i = 0; i < splitHash.length ; i++){
                                        if(bibtexFile.strings.containsKey(splitHash[i])){
                                            splitHash[i] = bibtexFile.strings.get(splitHash[i]);
                                        }
                                    }
                                    split[1] = Arrays.toString(splitHash);


                                }
                                split[1] = split[1].replaceAll("\"","");
                                split[1] = split[1].substring(0, split[1].length()-1);
                                fields.put(field, split[1]);

                            }
                            switch(entry.toUpperCase()){
                                case "ARTICLE":
                                    IBibtexElement article = new Article(fields, key);
                                    bibtexFile.put(article);
                                    break;
                                case "BOOK":
                                    IBibtexElement book = new Book(fields, key);
                                    bibtexFile.put(book);
                                    break;
                                case "BOOKLET":
                                    IBibtexElement booklet = new Booklet(fields, key);
                                    bibtexFile.put(booklet);
                                    break;
                                case "INBOOK":
                                    IBibtexElement inbook = new InBook(fields, key);
                                    bibtexFile.put(inbook);
                                    break;
                                case "INCOLLECTION":
                                    IBibtexElement incollection = new InCollection(fields, key);
                                    bibtexFile.put(incollection);
                                    break;
                                case "INPROCEEDINGS":
                                    IBibtexElement inproceedings = new InProceedings(fields, key);
                                    bibtexFile.put(inproceedings);
                                    break;
                                case "MANUAL":
                                    IBibtexElement manual = new Manual(fields, key);
                                    bibtexFile.put(manual);
                                    break;
                                case "MASTERSTHESIS":
                                    IBibtexElement mastersthesis = new MastersThesis(fields, key);
                                    bibtexFile.put(mastersthesis);
                                    break;
                                case "MISC":
                                    IBibtexElement misc = new Misc(fields, key);
                                    bibtexFile.put(misc);
                                    break;
                                case "PHDTHESIS":
                                    IBibtexElement phdthesis = new PhdThesis(fields, key);
                                    bibtexFile.put(phdthesis);
                                    break;
                                case "TECHREPORT":
                                    IBibtexElement techreport = new TechReport(fields, key);
                                    bibtexFile.put(techreport);
                                    break;
                                case "UNPUBLISHED":
                                    IBibtexElement unpublished = new Unpublished(fields, key);
                                    bibtexFile.put(unpublished);
                                    break;
                                default:
                                    throw new IllegalArgumentException("Wrong Entry name");
                            }



                    }


                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return bibtexFile;
    }

}
