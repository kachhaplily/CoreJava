class NewSwitchOp{
    public static void main(String args[]){

        String day ="wed";

        switch(day){
            case "mon" -> System.out.println(1);
            case "tue" -> System.out.println(2);
            case "wed" ->System.out.println(3);
            default -> System.out.println(0);
        }
    }
}