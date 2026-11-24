void main() {
    Scanner input = new Scanner(System.in);
/*
    System.out.println("Enter your role: (admin | user) ");
    String role = input.nextLine();

    if(role.equals("admin")){
        System.out.println("welcom");
    }else{
        System.out.println("your choise not in list");
    }

    if(role.equals("user")){
        System.out.println("limit access");
    }else{
        System.out.println("your choise not in list");
    }*/
    System.out.println("Enter your gread: ");
    int graed = input.nextInt();

    if(graed >100){
        System.out.println("The graed not allow: " + graed);
    }

    if(graed < 0){
        System.out.println("The graed not allow: " + graed);
    }
    if(graed >= 60){
        System.out.println("you pass: " + graed);
    }
    else {
        System.out.println("you fiald: " + graed);
    }



}
