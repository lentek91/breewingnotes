package pl.lentek.brewingnotes.batch;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import java.util.List;

public class BatchGrid extends VerticalLayout {

private Grid<Batch> grid = new Grid<>();

  public BatchGrid() {
    initializeGrid();
  }

  private void initializeGrid() {
    grid.addColumn(Batch::getId).setHeader("Numer warki");
    grid.addColumn(Batch::getName).setHeader("Nazwa warki");
    grid.addColumn(Batch::getStyleId).setHeader("Styl warki");
    grid.addColumn(Batch::getCreationDateTime).setHeader("Data wstawienia");

    add(grid);
  }

  public void setBatches(List<Batch> batches) {
    grid.setItems(batches);
  }
}
