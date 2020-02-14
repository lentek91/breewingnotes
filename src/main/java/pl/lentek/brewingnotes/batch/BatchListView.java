package pl.lentek.brewingnotes.batch;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.List;

@Route("batch")
public class BatchListView extends VerticalLayout {

  private final BatchRepository batchRepository;
  private BatchGrid batchGrid;

  public BatchListView(BatchRepository batchRepository) {
    this.batchRepository = batchRepository;

    initGrid();
  }

  private void initGrid() {
    batchGrid = new BatchGrid();

    refreshItems();

    add(batchGrid);
  }

  private void refreshItems() {
    List<Batch> batches = batchRepository.findAll();
    batchGrid.setBatches(batches);
  }
}
