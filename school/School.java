package ru.ivt5.school;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class School {
    private String name;
    private int year;
    private final Set<Group> Groups;

    public School(String name, int year) throws TrainingException{
        if(name == null || name.isEmpty()){
            throw new TrainingException(TrainingErrorCode.SCHOOL_WRONG_NAME);
        }
        this.name = name;
        this.year = year;
        this.Groups = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws TrainingException{
        if(name == null || name.isEmpty()){
            throw new TrainingException(TrainingErrorCode.SCHOOL_WRONG_NAME);
        }
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<Group> getGroups(){
        return Groups;
    }

    public void  addGroup(Group group) throws TrainingException{
        if(!this.Groups.add(group)){
            throw new TrainingException(TrainingErrorCode.DUPLICATE_GROUP_NAME);
        }
        this.Groups.add(group);
    }

    public void  removeGroup(Group group) throws TrainingException{
        if(!this.Groups.remove(group)){
            throw new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND);
        }
        this.Groups.remove(group);
    }

    public void  removeGroup(String name) throws TrainingException{
        Optional<Group> group = Optional.ofNullable(this.Groups.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .orElseThrow(()->new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND)));

        this.Groups.remove(group);
    }

    public boolean  containsGroup(Group group){
        if(this.Groups.contains(group)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return year == school.year && Objects.equals(name, school.name) && Objects.equals(Groups, school.Groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, Groups);
    }
}
