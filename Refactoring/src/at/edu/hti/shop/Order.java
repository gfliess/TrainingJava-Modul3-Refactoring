package at.edu.hti.shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Gerhard Fliess
 *
 */
public class Order
{

  private ArrayList<OrderLine> orderLines_ = new ArrayList<OrderLine>();

  public Collection<OrderLine> getOrderLines()
  {
    return orderLines_;
  }

public float calcPrize() {
	float sum = 0;
    for (Iterator<OrderLine> iter = orderLines_.iterator(); iter.hasNext();)
    {
      OrderLine temp = (OrderLine) iter.next();
      sum += temp.getProduct().getPrize() * temp.getCount();
    }
	return sum;
}
}
