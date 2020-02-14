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
    grid.addColumn(Batch::getId);
    grid.addColumn(Batch::getName);
    grid.addColumn(Batch::getStyleId);
    grid.addColumn(Batch::getCreationDateTime);

    add(grid);
  }

  public void setBatches(List<Batch> batches) {
    grid.setItems(batches);
  }
}
