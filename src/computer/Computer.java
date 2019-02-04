
package computer;


public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;

    /**
     * @return the operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * @param operatingSystem the operatingSystem to set
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * @return the processTact
     */
    public double getProcessTact() {
        return processTact;
    }

    /**
     * @param processTact the processTact to set
     */
    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    /**
     * @return the memory
     */
    public double getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(double memory) {
        this.memory = memory;
    }

    /**
     * @return the hardDrive
     */
    public int getHardDrive() {
        return hardDrive;
    }

    /**
     * @param hardDrive the hardDrive to set
     */
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    public Computer() {
        this.operatingSystem = "Linux";
        this.processTact = 2.4; // (GHz)
        this.memory = 16.0; // (GB)
        this.hardDrive = 500; // (GB)
    }
    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    
}
