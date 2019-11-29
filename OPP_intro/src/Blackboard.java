public class Blackboard {
        
        public void drawSquare (char c, int h) {
            // draw h rows of the square
            System.out.println();
            for (int i = 0; i < h; i++)
            {
		// draw ONE ROW of the square
		for (int j = 0; j < h; j++)
		{
                    System.out.print(c + " ");
		}
			
		// move to the next line so the next row 
		// of the square can be drawn
		System.out.println();
            }
        }
        
        public void drawCircle() {
            System.out.println("O");
        }
        
        public void drawText (String text) {
            System.out.append(text);
        }
        
        public void clear() {
            for (int i = 0; i < 50; ++i) 
                System.out.println();
        }
}
