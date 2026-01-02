package fleetmanagement;

public class Jet {
    private String jetName;
    private String country;
    private String company;
    private String jetType;
    private String generation;

    public Jet(String jetName, String country, String company, String jetType, String generation) {
        this.jetName = jetName;
        this.country = country;
        this.company = company;
        this.jetType = jetType;
        this.generation = generation;
    }

    public String getJetName() {
        return jetName;
    }

    public void setJetName(String jetName) {
        this.jetName = jetName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJetType() {
        return jetType;
    }

    public void setJetType(String jetType) {
        this.jetType = jetType;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Jet Name: " + jetName + "\n" +
                "Country: " + country + "\n" +
                "Company: " + company + "\n" +
                "Type: " + jetType + "\n" +
                "Generation: " + generation + "\n" +
                "-----------------------";
    }
}
