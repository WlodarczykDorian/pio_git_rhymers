package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {
	
		public DefaultCountingOutRhymer getStandardRhymer();
		
		public DefaultCountingOutRhymer getFalseRhymer();
		
		public DefaultCountingOutRhymer getFIFORhymer();
		
		public DefaultCountingOutRhymer getHanoiRhymer();
		
}
