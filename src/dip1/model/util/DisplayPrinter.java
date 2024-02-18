package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.ReportManager;

import java.util.Collection;

public class DisplayPrinter implements ReportManager {
    @Override
    public void output(Collection<ReportItem> items) {
        System.err.println("OUTPUT TO DISPLAY");
        for (ReportItem item : items) {
            System.out.format("DISPLAY %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
