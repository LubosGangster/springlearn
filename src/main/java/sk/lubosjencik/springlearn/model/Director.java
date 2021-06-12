package sk.lubosjencik.springlearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Director {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "directors")
    Set<Movie> movies = new HashSet<>();

    public Director(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Movie> getMovies(){
        return this.movies;
    }

    public void setMovies(Set<Movie> movies){
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return id.equals(director.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
