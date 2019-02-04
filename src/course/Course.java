package course;

public class Course {

    private String name;
    private int numberOfClasses;
    private String codeName;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberOfClasses
     */
    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    /**
     * @param numberOfClasses the numberOfClasses to set
     */
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    /**
     * @return the codeName
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * @param codeName the codeName to set
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
//constuctors
    public Course() {
        this.name = "QA";
        this.numberOfClasses = 1;
        this.codeName = "cubes2019";

    }

    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

}
