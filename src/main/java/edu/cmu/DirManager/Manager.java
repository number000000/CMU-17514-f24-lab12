package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return 0 if the directory creation was successful
     *        -1 if the directory already exists,
     *        -2 if the path is invalid
     */
    public void newDirectory(String path) throws Exception {
        if (dirOps.checkDirectoryExists(path)) {
            throw new Exception("Directory already exists");
        } else if (!dirOps.checkPathValid(path)) {
            throw new Exception("Directory not valid");
        } else {
            dirOps.createDirectory(path);
        }
    }
}
