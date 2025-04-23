
    import org.opencv.core.Core;
    import org.opencv.core.Mat;
    import org.opencv.core.MatOfRect;
    import org.opencv.core.Scalar;
    import org.opencv.core.Size;
    import org.opencv.imgcodecs.Imgcodecs;
    import org.opencv.objdetect.CascadeClassifier;
    import org.opencv.imgproc.Imgproc;
    
    public class FaceRecognitionModule {
        static {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        }
    
        public boolean recognizeFace(String imagePath, CascadeClassifier faceCascade) {
            Mat image = Imgcodecs.imread(imagePath);
            MatOfRect faceDetections = new MatOfRect();
            
            faceCascade.detectMultiScale(image, faceDetections, 1.1, 3, 0, new Size(30, 30), new Size(500, 500));
    
            if (faceDetections.toArray().length > 0) {
                // Face is detected, you can further process it or return true for attendance.
                return true;
            } else {
                // No face detected.
                return false;
            }
        }
    }
    

