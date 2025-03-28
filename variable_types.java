public class variables_types{
  int instance_variable=23;
  static int static_variable=34;
  public static void main(String [] args){
    int local_variable=43;
    variables_types obj=new variables_types();
    System.out.println(local_variable);
    System.out.println(variables_types.static_variable);
    System.out.println(obj.instance_variable);
  }
}
