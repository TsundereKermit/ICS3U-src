public class Dice {
    
        private int numExercises=0;
        
        public int roll() {
            numExercises+=1;
            return (int) (Math.random()*6+1);
        }
        
        public int numRolls() {
            return numExercises;
        }
        
        public void clear() {
            numExercises=0;
        
        }
}
