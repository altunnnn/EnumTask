public enum ProgrammingLanguage {
    JAVA(3000),
    JAVASCRIPT(1000),
    PYTHON(2000),
    C(400),
    R(1300);

    Integer salary;
    ProgrammingLanguage(int salary) {
        this.salary = salary;
    }
}
