

package org.tensorflow.lite.backdoor.it.customview;

import java.util.List;
import org.tensorflow.lite.backdoor.it.tflite.Classifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
