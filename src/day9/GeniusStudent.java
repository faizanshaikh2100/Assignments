
package day9;

        import java.util.Objects;

public class GeniusStudent implements Comparable<GeniusStudent> {

    int id;
    String name;

    public GeniusStudent(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeniusStudent [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GeniusStudent other = (GeniusStudent) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(GeniusStudent o) {
        // TODO Auto-generated method stub
        if(id == o.id) {
            return 0;
        }
        else if(id > o.id) {
            return 1;
        }
        else {
            return -1;
        }
    }





}
