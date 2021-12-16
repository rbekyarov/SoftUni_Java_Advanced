package ADV12DefiningClassesExercise.P7Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;

    private List<Parents> parents;
    private List<Children> children;
    private List<Pokemon> pokemon;

    /*public Person (Company company, Car car) {
        this.company = company;
        this.car = car;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();
    }*/

    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Company:").append("\n");
        if (company != null) {
            sb.append(company.toString()).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null) {
            sb.append(car.toString()).append("\n");
        }

        sb.append("Pokemon:").append("\n");
        for (Pokemon pok : pokemon) {
            sb.append(pok + "\n");
        }
        sb.append("Parents:").append("\n");
        for (Parents par : parents) {
            sb.append(par + "\n");
        }

        sb.append("Children:").append("\n");
        for (Children child : children) {
            sb.append(child + "\n");
        }
        return sb.toString();
    }
}

