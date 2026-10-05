import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Map;

public class GenerateBoiler { 
    public static void generateBoiler(String pkage, String classspec, String cname, 
                                      Map<String, String> map, String funspec, 
                                      String rtype, String funname) { 
        try (FileWriter writer = new FileWriter("E:\\javaseProjects\\generated.java")) { 
            writer.write("package " + pkage + ";\n\n"); 

            String formattedClassName = Character.toUpperCase(cname.charAt(0)) + cname.substring(1);
            writer.write(classspec + " class " + formattedClassName + " {\n"); 

           
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write("    private " + entry.getValue() + " " + entry.getKey() + ";\n");
            }
            writer.write("\n");

             
            writer.write("    " + funspec + " " + rtype + " " + funname + "() {\n"); 
            if (!rtype.equals("void")) {
                writer.write("        return null;\n");
            }
            writer.write("    }\n"); 
            writer.write("}\n"); 

            System.out.println("Boilerplate generated successfully!");
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
}