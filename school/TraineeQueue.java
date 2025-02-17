package ru.ivt5.school;

import java.util.LinkedList;
import java.util.Queue;

public class TraineeQueue {

    private final Queue<Trainee> queue;

    public TraineeQueue(){
        this.queue = new LinkedList<Trainee>();
    }

    public void addTrainee(Trainee trainee){
        this.queue.offer(trainee);
    }

    public Trainee removeTrainee() throws TrainingException{
        Trainee trainee = this.queue.poll();

        if(this.queue.isEmpty()){
            throw new TrainingException(TrainingErrorCode.EMPTY_TRAINEE_QUEUE);
        }
        return trainee;
    }

    public boolean isEmpty(){
        return this.queue.isEmpty();
    }
}
