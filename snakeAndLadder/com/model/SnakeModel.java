package com.model;
import java.util.ArrayList;
import com.model.*;

public class SnakeModel
{

		public int start;
		public int end;	

	
		public boolean equals(SnakeModel snake)
		{

			if(snake.getStart() == this.getEnd()) return true;

			return false;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}
	}

