public class GitObiekt {
    private String nazwa = "?";

    public GitObiekt() {
        System.out.println("I'm created");
    }

    public GitObiekt(String nazwa) {
        System.out.println("I'm " + nazwa + "!!!");
        this.nazwa = nazwa;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + nazwa);
    }

    public void changeNazwa(String nazwa){
        this.nazwa=nazwa;
    }
}
