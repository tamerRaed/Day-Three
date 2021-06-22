
package daythree.models;

import java.util.ArrayList;

public class Client extends Person{
    private ArrayList<Project> projects;

    public Client(Builder builder) {
        super(builder);
        this.projects = builder.projects;
    }
    
    public static Builder builder() {
          return new Builder();
      }
    
    public static class Builder extends Person.PersonBuilder<Builder> {

          private ArrayList<Project> projects;

          public Builder projects(ArrayList<Project> projects) {
              this.projects = projects;
              return this;
          }
          
          @Override
          public Builder getThis() {
              return this;
          }
          
          @Override
          public Client build() {
              return new Client(this);
          }

      }
}
