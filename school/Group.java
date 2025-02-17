package ru.ivt5.school;

import java.util.*;

public class Group {
    private String name;
    private String room;
    private final List<Trainee> Trainees;

    public Group(String name, String room,List<Trainee> array) throws TrainingException{
        if (name == null ||  room == null || room.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.GROUP_WRONG_NAME);
        }
        this.name = name;
        this.room = room;
        this.Trainees = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)throws TrainingException {
        if (name == null || name.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.GROUP_WRONG_NAME);
        }
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) throws TrainingException{
        if (room == null || room.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.GROUP_WRONG_ROOM);
        }
        this.room = room;
    }

    public List<Trainee> getTrainees() {
        return Trainees;
    }

    public void  addTrainee(Trainee trainee){
        Trainees.add(trainee);
    }

    public void  removeTrainee(Trainee trainee) throws TrainingException{
        if (!Trainees.remove(trainee)) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        Trainees.remove(trainee);
    }

    public void  removeTrainee(int index) throws TrainingException{
        if (index < 0 || index >= Trainees.size()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        Trainees.remove(Trainees.get(index));
    }

    public Trainee  getTraineeByFirstName(String firstName){
        return (Trainee) Trainees.stream().filter(item-> item.getFirstName().equals(firstName));
    }

    public Trainee  getTraineeByFullName(String fullName){
        return (Trainee) Trainees.stream().filter(item-> item.getFullName().equals(fullName));
    }

    public void  sortTraineeListByFirstNameAscendant(){
        Trainees.sort((t1,t2)-> t1.getFirstName().compareTo(t2.getFirstName()));
    }

    public void  sortTraineeListByRatingDescendant(){
        Trainees.sort(Comparator.comparingInt(Trainee::getRating));
    }

    public void  reverseTraineeList(){
        Trainees.reversed();
    }


    public void rotateTraineeList(int positions) {
        int size = Trainees.size();
        if (size > 0) {
            Collections.rotate(Trainees, positions % size);
        }
    }

    public List<Trainee>  getTraineesWithMaxRating() throws TrainingException {
        if (Trainees.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        int maxRating = Trainees.stream().mapToInt(Trainee::getRating).max().orElse(0);
        List<Trainee> result = new ArrayList<>();
        for (Trainee trainee : Trainees) {
            if (trainee.getRating() == maxRating) {
                result.add(trainee);
            }
        }
        return result;
    }

    public boolean  hasDuplicates(){
        for(int i=0;i<this.Trainees.size();i++){
            for(int j=i+1;j<this.Trainees.size();j++){
                if(Trainees.get(i).equals(Trainees.get(j))) return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(room, group.room) && Objects.equals(Trainees, group.Trainees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, room, Trainees);
    }
}
