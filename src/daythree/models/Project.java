
package daythree.models;

import daythree.Prototype;

public class Project implements Prototype{
    private String title;

    public Project(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    @Override
    public Prototype getClone() {
        return new Project("Project Title");
    }
    
}
