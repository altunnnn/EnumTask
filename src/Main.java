public class Main {
    public static void main(String[] args) {
//        for (ProgrammingLanguage p: ProgrammingLanguage.values()) {
//            System.out.println(p + " " + p.salary);
//        }
//        ProgrammingLanguage programmingLanguage = ProgrammingLanguage.JAVA;
//
//        switch (programmingLanguage){
//            case JAVA :
//                System.out.println("That is language which i love");
//                break;
//            case JAVASCRIPT:
//                System.out.println("That is language JAVSCRIPT");
//                break;
//            case PYTHON:
//                System.out.println("That is language PYTHON");
//                break;
//            case R:
//                System.out.println("That is language R");
//                break;
//            case C:
//                System.out.println("That is language C");
//                break;
//        }
        Human h1 = new Man();
        Human h2 = new Woman();
        Human h3 = new Child();

        h3.speaking();

        Woman woman = (Woman) new Human();

        woman.work();

        Man man = (Man) new Human();
        man.drive();

        Child child = (Child) new Human();
        child.school();
    }
}
