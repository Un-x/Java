public class Solution {
        public static void main(String[] args){
            Student obj = new Student();
            Class c4 = obj.getClass();
            Method[] methods = c4.getDeclaredMethods();
            ArrayList<String> methodList = new ArrayList<>();
            for(Method metho:methods)
            {
                methodList.add(metho.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
    }