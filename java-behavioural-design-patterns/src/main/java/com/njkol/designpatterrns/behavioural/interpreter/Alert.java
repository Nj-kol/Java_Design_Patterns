package com.njkol.designpatterrns.behavioural.interpreter;

import java.util.List;

/**
 * Here Alert serves as the Context object
 * 
 * @author Nilanjan
 *
 */
public class Alert {

  private List<MarketCriteria> marketCriteria;
  private List<DateFilterCriteria> dateFilterCriteria;
  private List<ConditionalCriteria> conditionalCriteria;
    		  
}
