 

package org.tensorflow.lite.backdoor.it.ObjectDetect.customview;

import org.tensorflow.lite.examples.detection.tflite.Detector.Recognition;

import java.util.List;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
