package domain;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date date;
    private Time hour;
    private String lieu;
    private String description;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Commentaire> commentaire;

    public Event() {
    }

    public Event(String name, Date date, Time hour, String lieu, String description, Category category) {
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.lieu = lieu;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
