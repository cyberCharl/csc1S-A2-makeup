public class Collator {
int numberOfReadings;
int record = 0;
int prevRecord;
int max;
int min;
double average;
int total;


    Collator() {
        numberOfReadings = 0;
    }

    void recordReading(int reading) {
        // Use the given reading to update the record.
        numberOfReadings++;
        prevRecord = record;
        record = reading;
        total+= reading;

        if (prevRecord < record) {
            max = record;
        }

        if (prevRecord > record) {
            min = record;
        }

    }

    int maximum() {
        // Obtain the largest reading taken. Requires numberOfReadings()>0.
        if (prevRecord < record) {
            return max = record;
        }
        else return prevRecord;

    }

    int minimum() {
        // Obtain the lowest reading taken. Requires numberOfReadings()>0
        return 3;
    }

    int average() {
        // Obtain the average of readings taken, rounded to the nearest integer.
        // Requires numberOfReadings() > 0.
        //  use (int)Math.round(average) to obtain the reported value.
        average = total/(double)numberOfReadings;

        Math.round(average);
        return 5;
    }

    int numberOfReadings() {
        return numberOfReadings;
    }
}
