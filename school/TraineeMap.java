package ru.ivt5.school;

import java.util.*;

public class TraineeMap {
    private final Map<Trainee,String> TraineeMap;

    public TraineeMap(){
        this.TraineeMap = new HashMap<Trainee,String>();
    }

    public void addTraineeInfo(Trainee trainee, String institute){
        this.TraineeMap.put(trainee,institute);
    }

    public void replaceTraineeInfo(Trainee trainee, String institute) throws TrainingException{
        if(!this.TraineeMap.containsKey(trainee)){
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        this.TraineeMap.replace(trainee,institute);
    }

    public void removeTraineeInfo(Trainee trainee) throws TrainingException{
        if(!this.TraineeMap.containsKey(trainee)){
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        this.TraineeMap.remove(trainee);
    }

    public int getTraineesCount(){
        return this.TraineeMap.size();
    }

    public String getInstituteByTrainee(Trainee trainee) throws TrainingException {
        if(!this.TraineeMap.containsKey(trainee)){
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        }
        return this.TraineeMap.get(trainee);
    }

    public Set<Trainee> getAllTrainees(){
        return TraineeMap.keySet();
    }

    public Set<String> getAllInstitutes(){
        return Set.copyOf(TraineeMap.values());
    }

    public boolean isAnyFromInstitute(String institute){
        return this.TraineeMap.containsValue(institute);
    }


}
