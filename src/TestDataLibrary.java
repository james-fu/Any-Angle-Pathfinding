import grid.anya.Point;

import java.util.Arrays;
import java.util.LinkedList;


/**
 * Problens: maze 5 and 6 corrupted data.
 * 
 * Test Plan:
 * Each of them has : near / far
 * 1) 30x30, ratio 7
 * 2) 30x30, ratio 15
 * 3) 30x30, ratio 50
 * 4) 100x100, ratio 7
 * 5) 100x100, ratio 15
 * 6) 100x100, ratio 50
 * 7) 500x500, ratio 7
 * 8) 500x500, ratio 50
 * 
 */
public class TestDataLibrary {
    
    
    private GraphInfo graphInfo;
    private LinkedList<StartEndPointData> dataList;
    private int nData;
    private float lowestComputedLength;
    private float highestComputedLength;
    private float meanComputedLength;
    private float overallMeanLength;
    
    public TestDataLibrary(int testIndex, PathLengthClass pathLengthClass) {
        int[] startXs = null;
        int[] startYs = null;
        int[] endXs = null;
        int[] endYs = null;
        double[] lengths = null;
        
        switch(testIndex) {
            case 1 : {
                graphInfo = new GraphInfo(1917370537, 30, 30, 7, 50);
                startXs = new int[]{18, 23, 26, 15, 19, 23, 12, 4, 17, 25, 23, 23, 4, 30, 14, 15, 15, 8, 29, 24, 9, 27, 21, 22, 13, 28, 14, 26, 6, 13, 12, 15, 11, 19, 6, 15, 18, 13, 7, 13, 28, 24, 15, 20, 17, 28, 25, 16, 17, 16, 24, 14, 23, 3, 24, 4, 18, 22, 14, 14, 18, 20, 20, 13, 11, 30, 9, 2, 3, 11, 20, 23, 23, 27, 30, 23, 24, 5, 15, 4, 2, 6, 9, 0, 28, 15, 11, 14, 28, 21, 2, 25, 11, 7, 30, 2, 0, 19, 1, 13};
                startYs = new int[]{18, 21, 15, 3, 16, 4, 8, 23, 15, 14, 4, 22, 23, 20, 4, 24, 26, 7, 11, 27, 10, 28, 21, 9, 16, 28, 15, 13, 12, 9, 17, 29, 7, 3, 0, 14, 14, 30, 17, 24, 21, 12, 0, 6, 27, 22, 19, 22, 25, 4, 7, 6, 18, 0, 19, 18, 3, 20, 24, 4, 1, 13, 13, 29, 25, 16, 17, 16, 7, 12, 10, 14, 17, 25, 19, 25, 13, 20, 29, 22, 11, 26, 4, 15, 16, 17, 17, 21, 23, 30, 13, 5, 2, 8, 24, 6, 11, 2, 17, 17};
                endXs = new int[]{21, 25, 23, 5, 0, 28, 2, 19, 29, 3, 20, 30, 22, 24, 30, 1, 22, 22, 3, 24, 14, 25, 9, 16, 14, 19, 19, 6, 24, 8, 29, 26, 3, 4, 12, 9, 25, 20, 11, 19, 23, 13, 21, 21, 10, 8, 21, 19, 21, 6, 5, 1, 23, 4, 24, 21, 18, 24, 23, 10, 18, 18, 9, 10, 27, 26, 4, 28, 2, 11, 16, 12, 15, 23, 18, 5, 18, 20, 13, 20, 10, 22, 13, 15, 23, 23, 11, 18, 21, 20, 16, 30, 29, 8, 20, 28, 15, 28, 10, 15};
                endYs = new int[]{9, 20, 29, 12, 10, 13, 9, 3, 28, 23, 8, 24, 8, 26, 15, 12, 9, 13, 16, 5, 26, 18, 14, 22, 10, 16, 3, 2, 2, 12, 14, 28, 11, 22, 18, 18, 10, 4, 23, 18, 27, 4, 12, 5, 3, 8, 4, 24, 11, 27, 25, 12, 10, 29, 14, 6, 2, 17, 26, 4, 15, 3, 10, 6, 29, 30, 7, 28, 2, 11, 18, 19, 12, 5, 9, 20, 25, 17, 30, 20, 1, 5, 12, 18, 20, 18, 8, 19, 18, 7, 20, 14, 11, 7, 10, 13, 16, 19, 20, 16};
                lengths = new double[]{14.335088, 2.236068, 19.472136, 21.48768, 21.010468, 10.398346, 19.799725, 27.88647, 18.377445, 28.08043, 5.0, 7.28011, 29.797892, 12.2426405, 21.050495, 18.962467, 19.55607, 18.414373, 28.899494, 22.825096, 22.975685, 10.537319, 17.222126, 18.315224, 6.9907045, 15.622809, 13.719111, 25.098083, 27.783855, 12.245041, 24.0591, 17.142181, 18.60555, 27.624413, 21.084263, 7.773387, 9.639193, 28.787899, 9.123106, 11.699596, 12.071068, 15.944272, 14.485281, 1.4142135, 26.955181, 26.175308, 17.197947, 4.1622777, 15.313708, 26.966389, 31.874573, 20.519266, 9.123106, 35.75683, 8.236068, 27.443434, 1.0, 3.6055512, 10.704571, 4.0, 15.621232, 15.8416195, 15.365057, 24.892921, 19.284006, 17.176512, 15.845516, 30.674717, 36.17514, 1.0, 15.749301, 17.34166, 11.536632, 21.705667, 18.5579, 20.72135, 14.13256, 21.700834, 2.236068, 19.942238, 25.077688, 30.922142, 8.944272, 15.484184, 6.8309517, 16.226772, 10.414213, 10.819131, 8.819132, 23.123106, 26.595242, 12.0, 20.853302, 2.0, 18.870445, 37.725246, 16.266487, 20.475986, 14.284695, 9.0};
                break;
            }
            case 2 : {
                graphInfo = new GraphInfo(1026798661, 30, 30, 15, 50);
                startXs = new int[]{23, 7, 11, 25, 13, 23, 6, 10, 4, 16, 12, 21, 17, 19, 11, 30, 3, 29, 17, 9, 21, 19, 18, 10, 13, 26, 0, 24, 25, 10, 23, 14, 8, 1, 6, 16, 25, 3, 25, 28, 15, 3, 21, 1, 12, 8, 0, 15, 9, 20, 1, 0, 6, 28, 19, 16, 26, 15, 17, 9, 9, 24, 30, 30, 25, 28, 2, 28, 19, 4, 25, 11, 4, 13, 29, 15, 6, 19, 29, 0, 11, 10, 18, 18, 29, 1, 5, 1, 8, 17, 28, 16, 14, 21, 18, 13, 13, 16, 2, 18};
                startYs = new int[]{27, 8, 24, 30, 13, 2, 25, 23, 0, 18, 24, 8, 16, 21, 5, 8, 17, 6, 12, 29, 13, 24, 6, 24, 18, 11, 23, 24, 9, 20, 24, 16, 26, 26, 6, 11, 29, 0, 26, 11, 2, 14, 23, 22, 27, 18, 30, 15, 20, 10, 1, 20, 30, 12, 0, 1, 20, 20, 11, 9, 29, 29, 0, 5, 2, 30, 19, 4, 16, 28, 2, 1, 1, 18, 11, 9, 5, 26, 27, 10, 24, 9, 1, 19, 21, 11, 1, 17, 9, 30, 7, 17, 26, 29, 25, 18, 8, 21, 14, 7};
                endXs = new int[]{21, 13, 13, 19, 12, 25, 6, 6, 4, 8, 3, 27, 5, 6, 9, 16, 11, 9, 11, 10, 14, 17, 29, 1, 21, 8, 18, 21, 2, 5, 8, 23, 14, 30, 29, 11, 16, 27, 26, 27, 3, 2, 7, 14, 27, 4, 13, 3, 3, 4, 20, 29, 16, 15, 26, 14, 20, 19, 16, 24, 21, 15, 21, 25, 3, 14, 12, 18, 6, 1, 7, 20, 20, 18, 11, 21, 7, 29, 22, 11, 18, 26, 4, 25, 11, 20, 6, 22, 22, 18, 20, 21, 10, 28, 19, 12, 14, 22, 13, 6};
                endYs = new int[]{20, 5, 2, 4, 12, 23, 30, 7, 30, 21, 24, 26, 12, 15, 14, 17, 23, 21, 0, 1, 20, 14, 16, 30, 8, 22, 23, 18, 28, 9, 12, 11, 24, 19, 4, 4, 0, 21, 24, 30, 29, 23, 23, 7, 4, 3, 1, 18, 1, 13, 1, 7, 15, 24, 11, 17, 16, 27, 0, 8, 8, 28, 29, 19, 9, 22, 0, 20, 7, 24, 24, 5, 22, 12, 24, 28, 4, 28, 18, 5, 15, 9, 25, 21, 9, 23, 20, 17, 21, 27, 12, 6, 30, 29, 17, 0, 30, 11, 18, 15};
                lengths = new double[]{7.28011, 7.335088, 22.090721, 27.792482, 1.4142135, 21.790966, 9.398346, 18.45851, 30.246212, 9.246211, 9.0, 19.302757, 13.909269, 20.451235, 11.0, 16.643316, 11.87526, 26.314821, 15.369316, 28.2154, 10.046318, 10.828427, 21.107674, 12.456232, 15.044359, 24.6351, 23.88139, 6.708204, 32.108532, 15.407318, 21.092636, 10.358485, 15.4158, 31.005072, 23.662828, 11.830952, 31.465593, 32.232704, 2.236068, 19.029387, 30.977169, 9.055386, 17.061771, 20.330294, 31.87361, 20.008766, 32.253872, 17.074965, 22.92964, 16.95897, 19.140614, 35.12059, 25.30024, 18.667324, 14.7046995, 16.219543, 7.300563, 10.162277, 13.608387, 16.82418, 25.484665, 24.424685, 30.781643, 14.954414, 23.401718, 18.204332, 21.470911, 20.769978, 15.811388, 5.0, 29.924732, 10.486833, 26.727575, 10.245165, 23.45038, 22.566618, 2.0, 10.245041, 11.401754, 12.485888, 12.10655, 18.398346, 29.576113, 7.28011, 21.858414, 25.110813, 20.877289, 24.502491, 18.612856, 23.942238, 12.162277, 12.155507, 5.656854, 7.0, 8.773387, 19.0, 22.247622, 11.9725275, 17.618511, 15.848194};
                break;
            }
            case 3 : {
                graphInfo = new GraphInfo(477622701, 30, 30, 50, 10);
                startXs = new int[]{10, 30, 3, 28, 21, 6, 14, 11, 23, 7, 5, 0, 20, 17, 17, 18, 4, 17, 10, 24, 7, 3, 0, 4, 29, 9, 9, 5, 30, 20, 25, 13, 19, 8, 20, 9, 24, 3, 8, 24, 28, 14, 27, 13, 26, 2, 27, 29, 24, 15, 9, 3, 28, 6, 16, 14, 23, 16, 22, 27, 24, 19, 26, 5, 11, 29, 12, 15, 11, 25, 25, 3, 23, 21, 23, 9, 8, 29, 14, 27, 16, 30, 15, 19, 0, 28, 14, 23, 6, 13, 9, 22, 18, 9, 4, 24, 22, 5, 1, 23};
                startYs = new int[]{26, 9, 24, 13, 0, 23, 14, 17, 27, 22, 21, 28, 24, 1, 22, 1, 13, 9, 28, 13, 18, 0, 24, 5, 14, 9, 29, 30, 13, 12, 13, 1, 9, 21, 7, 10, 19, 23, 11, 10, 5, 16, 30, 15, 6, 1, 2, 29, 22, 10, 3, 1, 29, 1, 10, 20, 18, 13, 1, 7, 2, 13, 18, 6, 25, 17, 5, 2, 1, 4, 13, 14, 29, 10, 23, 3, 24, 1, 13, 20, 0, 3, 11, 22, 7, 19, 8, 30, 28, 16, 28, 26, 8, 3, 16, 6, 17, 18, 13, 12};
                endXs = new int[]{17, 5, 20, 17, 3, 2, 11, 29, 22, 27, 22, 28, 19, 19, 26, 22, 19, 12, 1, 9, 10, 18, 12, 3, 4, 23, 8, 13, 9, 8, 15, 29, 11, 26, 12, 19, 29, 19, 26, 0, 19, 9, 10, 30, 6, 6, 14, 5, 9, 8, 19, 1, 26, 4, 30, 23, 30, 11, 5, 29, 11, 29, 1, 16, 10, 13, 5, 14, 19, 12, 5, 16, 9, 23, 9, 0, 4, 29, 10, 4, 2, 16, 29, 28, 4, 20, 15, 28, 2, 16, 28, 19, 29, 13, 12, 20, 21, 17, 5, 22};
                endYs = new int[]{11, 9, 0, 5, 6, 1, 30, 16, 10, 25, 22, 6, 24, 19, 17, 8, 17, 3, 25, 8, 9, 2, 9, 7, 5, 22, 17, 27, 20, 4, 29, 4, 11, 9, 19, 29, 6, 17, 12, 2, 0, 21, 14, 13, 12, 3, 24, 26, 7, 22, 11, 8, 29, 2, 13, 14, 25, 1, 5, 14, 3, 15, 1, 22, 22, 11, 16, 19, 19, 23, 17, 25, 19, 29, 6, 7, 16, 4, 27, 11, 23, 10, 13, 10, 15, 3, 28, 5, 9, 21, 20, 26, 30, 1, 20, 29, 0, 0, 13, 11};
                lengths = new double[]{16.892445, 25.0, 29.73002, 14.207876, 19.027409, 22.36068, 16.27882, 18.029387, 17.029387, 20.22375, 17.288631, 35.61313, 1.0, 18.267288, 10.303087, 8.062258, 15.880827, 7.81025, 9.516178, 15.866069, 9.486833, 15.132746, 19.209373, 2.236068, 26.698292, 19.344923, 12.0415945, 8.5440035, 22.135944, 14.422205, 18.878912, 16.401754, 8.246211, 21.763353, 14.601126, 21.603264, 14.077163, 17.088007, 18.560623, 25.334217, 10.52623, 7.071068, 23.345926, 17.117243, 20.880613, 4.472136, 25.944273, 24.203604, 21.561398, 13.892444, 12.806249, 7.28011, 2.0, 2.236068, 14.615773, 10.816654, 9.899494, 13.0, 17.560219, 7.28011, 13.038404, 10.198039, 30.419281, 19.909462, 3.1622777, 17.529964, 13.038404, 17.029387, 19.75934, 23.02204, 20.396078, 17.058609, 17.207022, 19.104973, 22.20465, 9.954058, 8.944272, 3.0, 14.60471, 25.062258, 26.925823, 15.652476, 14.324555, 15.360126, 8.944272, 17.911116, 20.082764, 25.57798, 20.235384, 6.0, 20.676052, 3.0, 25.099768, 4.472136, 8.944272, 23.35849, 17.029387, 21.633307, 4.0, 1.4142135};
                break;
            }
            case 4 : {
                graphInfo = new GraphInfo(863458998, 100, 100, 7, 10);
                startXs = new int[]{51, 38, 73, 13, 83, 92, 39, 69, 73, 35, 93, 60, 5, 5, 61, 95, 86, 11, 9, 94, 44, 44, 58, 77, 48, 39, 69, 12, 33, 27, 43, 41, 94, 5, 21, 92, 81, 4, 86, 94, 91, 33, 92, 56, 85, 75, 77, 67, 34, 5, 47, 38, 20, 0, 86, 72, 9, 22, 48, 44, 24, 1, 23, 54, 94, 33, 36, 97, 79, 14, 55, 98, 8, 11, 38, 45, 91, 79, 99, 21, 100, 72, 63, 54, 64, 69, 70, 6, 33, 12, 56, 10, 33, 36, 0, 63, 65, 26, 22, 55};
                startYs = new int[]{20, 12, 12, 10, 72, 25, 61, 68, 84, 45, 2, 54, 74, 6, 72, 38, 62, 39, 90, 81, 66, 46, 57, 29, 41, 98, 31, 11, 17, 66, 50, 3, 27, 31, 21, 23, 74, 82, 49, 70, 60, 84, 87, 3, 37, 35, 11, 39, 82, 59, 39, 74, 47, 20, 75, 84, 68, 28, 80, 2, 91, 98, 94, 43, 66, 32, 50, 20, 79, 23, 100, 11, 15, 69, 4, 8, 39, 54, 12, 15, 11, 34, 93, 36, 22, 60, 65, 52, 69, 48, 16, 25, 11, 68, 37, 30, 81, 92, 80, 36};
                endXs = new int[]{64, 57, 66, 87, 93, 1, 71, 14, 48, 10, 90, 40, 64, 86, 31, 57, 8, 62, 80, 49, 25, 10, 48, 89, 71, 23, 18, 34, 37, 63, 12, 20, 61, 6, 0, 48, 43, 32, 66, 92, 70, 79, 26, 88, 6, 28, 78, 73, 30, 29, 55, 12, 97, 43, 93, 84, 79, 84, 74, 60, 27, 93, 48, 42, 86, 8, 6, 50, 56, 66, 24, 2, 83, 90, 77, 49, 76, 64, 13, 49, 81, 10, 50, 14, 51, 96, 20, 3, 16, 68, 26, 86, 54, 92, 4, 69, 89, 45, 34, 1};
                endYs = new int[]{44, 70, 35, 8, 81, 21, 60, 69, 33, 14, 10, 10, 31, 67, 84, 19, 32, 76, 2, 8, 40, 29, 61, 60, 49, 63, 30, 7, 59, 57, 47, 86, 0, 35, 87, 79, 100, 68, 78, 19, 40, 13, 41, 35, 84, 17, 80, 72, 63, 26, 90, 64, 4, 71, 11, 22, 66, 34, 9, 60, 25, 25, 28, 24, 68, 54, 95, 68, 19, 81, 75, 83, 13, 75, 85, 71, 76, 83, 60, 98, 92, 61, 54, 93, 34, 5, 48, 8, 21, 81, 40, 60, 25, 40, 46, 74, 83, 1, 91, 46};
                lengths = new double[]{32.110413, 99.40131, 35.255898, 97.69808, 15.008676, 109.12194, 37.335262, 59.028854, 73.41203, 45.440887, 8.927446, 71.56989, 98.13567, 123.89395, 35.894478, 54.72086, 108.544365, 86.267105, 146.5352, 113.393524, 62.623436, 41.014416, 16.246212, 74.23054, 51.262268, 49.033775, 63.960594, 51.677704, 51.396126, 43.683136, 50.916637, 113.37902, 46.564903, 5.0, 84.71754, 112.05936, 52.83283, 35.720867, 46.328346, 99.27693, 62.76489, 100.68566, 102.65793, 88.79776, 135.59958, 74.31968, 86.57468, 51.037857, 28.131872, 65.805664, 75.39785, 30.824242, 115.69135, 93.91033, 93.73765, 94.25028, 92.13628, 87.892914, 105.93464, 120.678314, 85.015396, 147.59538, 77.80914, 24.272501, 10.472136, 83.83183, 67.126724, 122.83766, 72.10934, 99.05943, 43.01619, 146.24556, 92.45886, 84.566895, 104.888054, 90.90729, 109.76818, 45.04863, 128.26013, 96.87924, 121.02167, 122.23463, 67.866295, 90.209366, 21.59263, 111.87887, 86.54086, 87.72994, 64.508644, 85.39712, 42.141743, 100.452705, 31.85059, 111.90968, 13.720253, 65.32809, 28.177803, 107.36912, 21.800955, 65.207855};
                break;
            }
            case 5 : {
                graphInfo = new GraphInfo(-2072049129, 100, 100, 15, 10);
                startXs = new int[]{7, 32, 13, 47, 50, 90, 11, 89, 67, 95, 50, 29, 5, 71, 37, 84, 3, 27, 94, 59, 30, 34, 88, 87, 49, 31, 0, 1, 63, 11, 3, 15, 32, 10, 22, 80, 44, 20, 4, 83, 38, 61, 21, 43, 80, 12, 12, 6, 67, 76, 32, 14, 4, 80, 62, 31, 82, 25, 97, 78, 23, 35, 75, 11, 93, 60, 83, 93, 51, 63, 41, 66, 100, 32, 77, 8, 69, 63, 2, 9, 21, 92, 70, 3, 52, 69, 29, 88, 42, 4, 76, 25, 92, 45, 26, 94, 87, 94, 61, 23};
                startYs = new int[]{3, 15, 72, 11, 99, 71, 8, 81, 21, 17, 46, 44, 5, 17, 65, 42, 92, 40, 16, 43, 24, 18, 49, 96, 87, 32, 5, 53, 51, 100, 18, 100, 15, 32, 56, 30, 69, 3, 64, 59, 44, 35, 84, 59, 34, 90, 44, 79, 34, 58, 91, 71, 21, 31, 22, 39, 60, 30, 14, 67, 55, 97, 18, 51, 42, 38, 6, 93, 79, 91, 97, 69, 20, 80, 89, 20, 18, 2, 74, 28, 47, 82, 18, 57, 62, 98, 7, 21, 84, 60, 69, 30, 17, 65, 31, 86, 13, 42, 39, 46};
                endXs = new int[]{4, 21, 61, 7, 69, 83, 0, 88, 28, 49, 80, 81, 38, 62, 75, 97, 33, 73, 73, 4, 96, 16, 49, 58, 38, 99, 95, 96, 97, 62, 85, 49, 80, 82, 24, 5, 18, 61, 21, 75, 5, 87, 47, 92, 70, 78, 57, 66, 86, 38, 88, 30, 42, 76, 39, 56, 55, 80, 68, 35, 30, 19, 54, 84, 24, 45, 22, 13, 82, 61, 55, 52, 46, 35, 63, 58, 52, 66, 49, 27, 60, 51, 28, 8, 97, 56, 57, 40, 18, 16, 86, 69, 5, 82, 51, 77, 83, 79, 32, 51};
                endYs = new int[]{22, 82, 2, 15, 73, 37, 80, 65, 22, 22, 32, 52, 74, 7, 38, 24, 65, 60, 94, 19, 44, 15, 9, 32, 17, 5, 14, 29, 77, 54, 48, 22, 82, 77, 0, 26, 19, 61, 82, 94, 99, 0, 20, 62, 27, 93, 35, 68, 44, 56, 70, 75, 76, 14, 91, 89, 65, 58, 80, 22, 84, 38, 7, 10, 14, 34, 18, 88, 52, 87, 79, 58, 67, 34, 35, 50, 82, 48, 29, 62, 18, 91, 73, 17, 66, 45, 89, 53, 41, 19, 35, 63, 63, 95, 3, 45, 52, 43, 32, 26};
                lengths = new double[]{24.60128, 74.50988, 88.54984, 40.81366, 32.573254, 36.54254, 76.86156, 16.03122, 50.6475, 46.794167, 36.78066, 53.877335, 81.85592, 14.329437, 49.676014, 23.34968, 41.457397, 52.783466, 81.093475, 61.34572, 77.00514, 18.667809, 58.77479, 71.86041, 73.66275, 81.08834, 97.07784, 100.42957, 44.47677, 70.13686, 89.5521, 86.35926, 85.04148, 91.86362, 56.704487, 78.45758, 58.90296, 77.228294, 27.460968, 37.557358, 67.459015, 45.53658, 70.73416, 61.84484, 14.440307, 68.20004, 48.514275, 61.808598, 22.040432, 43.53596, 62.643135, 16.944271, 68.7773, 18.44766, 75.05014, 59.773914, 31.649754, 63.208183, 72.99418, 64.70063, 31.843546, 62.420643, 25.233301, 84.579346, 76.40707, 15.615071, 62.77173, 81.66162, 41.37326, 5.236068, 24.707832, 18.170954, 73.10688, 49.887604, 57.378845, 58.91292, 66.54524, 47.75622, 67.65162, 38.67668, 50.555916, 44.207764, 69.75085, 41.979034, 49.806236, 57.463333, 89.814865, 59.697906, 53.45513, 43.08439, 36.31408, 56.022575, 100.47384, 48.265617, 43.68731, 45.120537, 40.411537, 17.041595, 33.35645, 35.893044};
                break;
            }
            case 6 : {
                graphInfo = new GraphInfo(-2093474132, 100, 100, 50, 10);
                startXs = new int[]{79, 10, 62, 18, 49, 39, 33, 94, 25, 82, 18, 22, 66, 75, 41, 92, 0, 26, 51, 46, 30, 96, 14, 63, 92, 28, 11, 57, 86, 64, 23, 93, 54, 33, 64, 50, 8, 24, 93, 94, 25, 45, 7, 41, 51, 51, 33, 73, 61, 96, 71, 18, 74, 44, 18, 96, 40, 29, 97, 74, 63, 88, 59, 24, 57, 7, 49, 14, 54, 93, 84, 56, 83, 98, 76, 44, 70, 0, 65, 29, 28, 53, 91, 28, 8, 45, 7, 53, 96, 73, 24, 21, 80, 88, 15, 20, 55, 11, 43, 40};
                startYs = new int[]{10, 0, 29, 61, 94, 64, 91, 25, 44, 13, 54, 21, 89, 23, 45, 70, 14, 42, 53, 99, 51, 30, 56, 18, 8, 78, 65, 91, 29, 2, 17, 83, 8, 85, 72, 51, 36, 58, 72, 8, 53, 80, 29, 69, 45, 56, 0, 69, 11, 20, 81, 38, 53, 39, 6, 46, 5, 73, 15, 36, 79, 96, 2, 21, 67, 7, 100, 41, 93, 60, 59, 97, 40, 54, 30, 32, 71, 19, 50, 93, 89, 22, 49, 59, 55, 13, 60, 1, 30, 48, 73, 6, 41, 51, 3, 0, 99, 53, 20, 38};
                endXs = new int[]{99, 39, 52, 48, 31, 57, 52, 94, 8, 73, 28, 15, 29, 34, 94, 44, 45, 60, 81, 28, 78, 38, 75, 46, 34, 37, 80, 18, 26, 43, 53, 37, 8, 8, 60, 39, 21, 16, 30, 68, 86, 48, 89, 44, 81, 71, 86, 21, 66, 99, 45, 36, 32, 83, 77, 4, 91, 3, 94, 13, 98, 59, 84, 68, 72, 66, 97, 65, 54, 32, 36, 64, 64, 46, 74, 70, 1, 51, 55, 93, 24, 80, 54, 20, 98, 69, 76, 27, 89, 79, 79, 95, 10, 47, 6, 65, 55, 80, 80, 31};
                endYs = new int[]{78, 48, 65, 50, 5, 40, 63, 42, 78, 83, 24, 79, 79, 99, 31, 15, 97, 91, 56, 62, 42, 67, 59, 8, 43, 16, 82, 67, 40, 9, 89, 41, 61, 0, 82, 87, 50, 87, 86, 97, 45, 28, 41, 79, 97, 6, 84, 71, 76, 37, 41, 15, 7, 46, 4, 31, 30, 88, 58, 57, 93, 82, 5, 49, 12, 76, 99, 56, 49, 89, 88, 28, 65, 70, 11, 52, 64, 30, 5, 23, 9, 100, 65, 27, 88, 36, 26, 88, 77, 21, 73, 79, 89, 47, 21, 32, 53, 71, 71, 42};
                lengths = new double[]{70.946075, 56.091877, 37.45698, 31.979883, 91.29656, 30.138954, 33.94847, 17.271736, 38.183884, 70.666466, 31.850004, 58.44799, 38.32995, 86.69285, 55.057354, 73.00746, 94.524734, 59.708992, 30.178892, 41.16558, 48.83646, 69.021805, 61.085346, 19.760925, 67.95032, 62.833744, 71.06749, 45.80616, 61.2593, 22.186539, 78.17537, 70.14125, 70.26384, 88.698235, 10.944272, 37.849026, 19.104973, 30.117447, 64.71321, 94.09929, 61.691994, 52.464424, 82.95198, 10.440307, 60.12398, 54.170982, 99.35069, 52.079872, 66.17649, 17.262676, 47.757793, 29.560066, 62.449516, 39.623226, 59.04158, 93.35997, 56.893425, 30.016663, 43.438667, 64.513565, 37.767563, 32.290787, 25.181839, 52.274464, 57.05253, 91.10592, 48.239086, 53.886803, 44.0, 67.90888, 56.407772, 69.49806, 31.400637, 55.32739, 19.121166, 35.147877, 69.37351, 52.416588, 46.367275, 94.893394, 80.35524, 82.6348, 40.322674, 34.624985, 96.066536, 33.66033, 77.105965, 90.84372, 47.735718, 27.921408, 55.044376, 104.23717, 85.240036, 41.274563, 20.12461, 55.430294, 46.0, 71.31613, 63.19553, 9.958217};
                break;
            }
            case 7 : {
                graphInfo = new GraphInfo(-2106709534, 500, 500, 7, 1);
                startXs = new int[]{210, 423, 346, 172, 418, 123, 92, 316, 411, 474, 116, 479, 463, 457, 259, 283, 176, 318, 229, 304, 467, 460, 420, 459, 464, 222, 159, 72, 294, 390, 106, 359, 391, 333, 107, 108, 371, 370, 212, 416, 417, 261, 15, 79, 255, 179, 478, 301, 428, 321, 394, 68, 343, 455, 447, 430, 375, 255, 467, 346, 319, 352, 468, 193, 348, 66, 318, 40, 231, 1, 13, 118, 499, 149, 329, 483, 98, 236, 103, 164, 151, 429, 23, 47, 161, 119, 104, 421, 223, 158, 147, 488, 115, 62, 182, 317, 468, 284, 102, 433};
                startYs = new int[]{217, 181, 452, 165, 19, 431, 230, 365, 477, 98, 463, 329, 305, 76, 15, 262, 320, 62, 448, 242, 161, 233, 418, 79, 156, 67, 495, 167, 273, 21, 197, 260, 215, 167, 191, 41, 406, 411, 371, 14, 457, 164, 457, 244, 4, 390, 327, 196, 164, 473, 236, 19, 149, 338, 479, 329, 257, 65, 91, 467, 251, 362, 382, 241, 322, 52, 483, 328, 352, 57, 401, 447, 404, 58, 255, 128, 181, 259, 141, 269, 242, 377, 406, 47, 45, 231, 188, 365, 172, 186, 200, 427, 167, 390, 388, 483, 61, 172, 476, 466};
                endXs = new int[]{244, 303, 448, 455, 249, 174, 457, 158, 89, 125, 361, 59, 109, 427, 435, 455, 411, 362, 270, 184, 497, 330, 383, 371, 439, 1, 240, 131, 385, 366, 169, 368, 293, 217, 493, 52, 123, 162, 235, 224, 125, 276, 73, 166, 483, 70, 27, 353, 243, 157, 133, 378, 98, 281, 395, 298, 455, 247, 297, 181, 386, 459, 81, 237, 349, 210, 19, 345, 304, 450, 72, 364, 366, 339, 208, 157, 198, 245, 216, 71, 480, 80, 137, 224, 490, 432, 439, 354, 452, 162, 265, 475, 29, 217, 314, 343, 271, 58, 150, 304};
                endYs = new int[]{471, 144, 500, 184, 172, 417, 89, 148, 366, 419, 383, 332, 360, 379, 258, 403, 378, 382, 484, 143, 443, 236, 229, 139, 490, 342, 171, 225, 451, 472, 294, 11, 193, 440, 159, 380, 368, 382, 436, 218, 408, 82, 259, 467, 215, 146, 270, 172, 229, 486, 13, 121, 278, 227, 208, 355, 230, 63, 355, 248, 251, 44, 239, 447, 101, 189, 425, 95, 236, 16, 359, 258, 494, 237, 489, 252, 97, 457, 442, 403, 250, 346, 130, 207, 193, 99, 289, 476, 131, 365, 475, 5, 175, 99, 229, 364, 136, 210, 343, 478};
                lengths = new double[]{290.69052, 225.38187, 140.46623, 365.89145, 289.64417, 92.30689, 466.3383, 317.43515, 405.94785, 604.4343, 288.3532, 527.75977, 513.34595, 416.01135, 419.0016, 258.97018, 309.641, 400.89752, 67.8991, 184.56757, 421.8172, 223.33078, 225.83704, 146.74664, 439.39432, 438.60663, 400.48013, 93.543495, 235.73419, 541.8897, 131.9604, 346.25665, 132.0624, 364.2649, 477.05728, 421.06558, 291.6174, 241.72021, 95.963585, 352.3098, 382.40723, 107.521614, 238.31781, 302.39316, 346.62518, 342.90195, 599.2789, 109.86642, 276.03387, 194.93733, 419.25528, 405.97034, 327.1818, 273.99466, 329.18286, 184.11104, 121.36647, 8.246211, 390.48083, 362.08893, 104.38136, 385.5322, 491.4279, 279.6091, 311.45468, 283.91388, 340.9602, 475.6295, 193.64413, 524.4423, 100.008194, 392.58057, 219.3201, 317.48175, 331.48566, 415.1016, 175.31648, 238.6773, 379.20932, 196.39511, 404.73413, 417.4289, 361.036, 342.02084, 408.83133, 417.4415, 421.74115, 139.63339, 329.23596, 201.05405, 348.07257, 548.86053, 121.71928, 423.8107, 269.68808, 210.55176, 321.55496, 264.2439, 164.37636, 181.84329};
                break;
            }
            case 8 : {
                graphInfo = new GraphInfo(-492224089, 500, 500, 50, 1);
                startXs = new int[]{362, 174, 24, 328, 143, 190, 178, 281, 230, 278, 54, 138, 262, 458, 351, 443, 409, 6, 139, 389, 184, 104, 397, 468, 471, 470, 129, 260, 421, 7, 408, 373, 226, 433, 93, 297, 188, 358, 159, 382, 90, 132, 426, 181, 272, 367, 450, 400, 177, 490, 457, 210, 220, 341, 296, 8, 219, 210, 439, 73, 165, 380, 224, 270, 96, 15, 296, 289, 399, 208, 229, 107, 307, 217, 173, 385, 176, 67, 58, 290, 500, 70, 343, 140, 0, 151, 233, 156, 144, 79, 346, 27, 175, 285, 2, 47, 61, 213, 333, 201};
                startYs = new int[]{1, 185, 456, 307, 482, 274, 135, 368, 151, 161, 117, 17, 311, 80, 159, 61, 71, 366, 430, 357, 290, 8, 90, 274, 171, 245, 70, 459, 326, 166, 48, 253, 386, 69, 473, 131, 67, 200, 8, 280, 324, 206, 121, 413, 405, 448, 418, 367, 286, 427, 217, 149, 36, 297, 248, 441, 343, 415, 74, 499, 465, 115, 316, 477, 219, 400, 200, 19, 212, 32, 240, 6, 348, 187, 118, 413, 301, 337, 90, 141, 141, 238, 330, 124, 232, 290, 428, 166, 435, 421, 151, 71, 319, 406, 291, 86, 27, 257, 461, 338};
                endXs = new int[]{72, 366, 96, 270, 209, 236, 0, 424, 347, 338, 193, 167, 496, 170, 360, 242, 70, 184, 256, 334, 219, 104, 106, 44, 402, 264, 375, 237, 341, 194, 390, 229, 336, 430, 191, 337, 5, 217, 345, 66, 431, 210, 37, 380, 304, 173, 389, 258, 181, 298, 84, 48, 363, 126, 210, 60, 263, 370, 220, 350, 24, 485, 396, 390, 477, 199, 394, 209, 269, 238, 116, 483, 13, 8, 359, 420, 430, 134, 22, 335, 311, 207, 145, 441, 367, 8, 244, 14, 261, 372, 9, 449, 133, 475, 49, 371, 75, 287, 441, 488};
                endYs = new int[]{248, 126, 305, 140, 500, 386, 327, 216, 237, 235, 488, 163, 384, 28, 443, 416, 125, 417, 16, 409, 192, 285, 227, 67, 249, 431, 162, 338, 468, 80, 255, 467, 467, 294, 191, 11, 134, 114, 123, 1, 30, 162, 39, 369, 25, 145, 302, 6, 304, 29, 34, 296, 150, 393, 186, 466, 35, 225, 331, 288, 323, 254, 79, 391, 451, 153, 98, 381, 229, 274, 88, 27, 99, 114, 289, 477, 419, 437, 361, 371, 47, 372, 369, 106, 355, 83, 347, 271, 420, 192, 97, 206, 409, 15, 352, 349, 25, 378, 89, 239};
                lengths = new double[]{381.49512, 201.06549, 167.4157, 177.4016, 68.74362, 121.32909, 262.34402, 209.00868, 145.32326, 95.39449, 396.29898, 149.0516, 245.43925, 292.93622, 284.62167, 409.40915, 343.4057, 185.50073, 430.7353, 75.99766, 104.30176, 277.58838, 322.2361, 472.2078, 104.298454, 278.0258, 262.72647, 123.384544, 163.14139, 206.53613, 208.0033, 258.70438, 136.91934, 225.2636, 299.13794, 127.26436, 194.99802, 165.63596, 219.00099, 422.3555, 450.89386, 89.55623, 398.22632, 205.16852, 381.5801, 360.12268, 131.49577, 388.6848, 18.59388, 442.33658, 416.01694, 219.01242, 183.04808, 236.34476, 106.25215, 57.873047, 312.93115, 248.78879, 337.9299, 348.504, 200.38849, 175.61382, 293.21292, 147.96489, 446.8216, 308.68103, 141.58524, 371.7007, 131.34279, 244.11143, 189.9832, 377.05353, 385.8725, 221.6125, 253.88545, 73.167145, 280.35095, 120.76796, 273.48193, 234.72653, 212.6141, 192.34683, 201.91028, 302.21326, 387.3062, 251.96753, 81.76128, 176.66956, 118.297485, 372.5172, 341.76974, 443.5554, 99.413345, 435.42996, 77.71492, 418.0928, 14.198039, 142.00832, 387.782, 304.17307};
                break;
            }
        }
        
        float[] minMax = computeMinMax(pathLengthClass, lengths);
        addToDataList(startXs, startYs, endXs, endYs, lengths, minMax[0], minMax[1]);
    }
    

    private void addToDataList(int[] startXs, int[] startYs, int[] endXs,
            int[] endYs, double[] lengths, float minLength, float maxLength) {
        dataList = new LinkedList<>();
        assert startXs.length == startYs.length;
        assert startYs.length == endXs.length;
        assert endXs.length == endYs.length;
        assert endYs.length == lengths.length;

        double sumOverall = 0;
        double sumComputed = 0;
        lowestComputedLength = Float.POSITIVE_INFINITY;
        lowestComputedLength = Float.NEGATIVE_INFINITY;
        
        for (int i=0; i<startXs.length; i++) {
            double length = lengths[i];
            sumOverall += length;
            if (minLength <= lengths[i] && lengths[i] <= maxLength) {
                sumComputed += length;
                if (length < lowestComputedLength) lowestComputedLength = (float)length;
                if (length > lowestComputedLength) lowestComputedLength = (float)length;
                
                Point start = new Point(startXs[i], startYs[i]);
                Point end = new Point(endXs[i], endYs[i]);
                StartEndPointData data = new StartEndPointData(start, end, (float)length);
                dataList.add(data);
            }            
        }
        
        nData = dataList.size();
        overallMeanLength = (float)(sumComputed / dataList.size());
        meanComputedLength = (float)(sumOverall / lengths.length);
    }


    /**
     * MUST NOT SORT THE LENGTHS ARRAY.
     */
    private float[] computeMinMax(PathLengthClass pathLengthClass,
            double[] lengths) {
        double[] newLengths = Arrays.copyOf(lengths, lengths.length);
        Arrays.sort(newLengths);
        
        float[] minMax = new float[2];

        float lowerPercentile = -1;
        float upperPercentile = -1;
        minMax[0] = Float.NEGATIVE_INFINITY;
        minMax[1] = Float.POSITIVE_INFINITY;
        
        switch(pathLengthClass) {
            case SHORTEST :
                upperPercentile = 0.25f;
                break;
            case LOWER :
                upperPercentile = 0.6f;
                break;
            case MIDDLE :
                lowerPercentile = 0.25f;
                upperPercentile = 0.75f;
                break;
            case HIGHER :
                lowerPercentile = 0.4f;
                break;
            case LONGEST :
                lowerPercentile = 0.75f;
                break;
            case ALL :
                break;
            default :
                break;
        }
        
        if (lowerPercentile > 0) {
            int index = (int)(newLengths.length*lowerPercentile);
            minMax[0] = (float)newLengths[index];
        }
        if (upperPercentile > 0) {
            int index = (int)(newLengths.length*upperPercentile);
            minMax[1] = (float)newLengths[index];
        }
        
        return minMax;
    }

    public static void analyseArray(double[] lengths) {
        Arrays.sort(lengths);
        System.out.println("Length: " + lengths.length);
        
        double sum = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double length : lengths) {
            sum += length;
            if (length < min) min = length;
            if (length > max) max = length;
        }
        
        double mean = sum / lengths.length;
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Mean: " + mean);

        int pL = lengths.length*1/4;
        int pH = lengths.length*3/4;

        System.out.println("Lower: " + lengths[pL]);
        System.out.println("Upper: " + lengths[pH]); 
    }
    

    public GraphInfo getGraphInfo() {
        return graphInfo;
    }
    
    public boolean hasNextData() {
        return !dataList.isEmpty();
    }
    
    public StartEndPointData getNextData() {
        return dataList.poll();
    }
    
    public float getLowestComputedLength() {
        return lowestComputedLength;
    }


    public float getHighestComputedLength() {
        return highestComputedLength;
    }


    public float getMeanComputedLength() {
        return meanComputedLength;
    }


    public float getOverallMeanLength() {
        return overallMeanLength;
    }


    public int getNData() {
        return nData;
    }
}


class GraphInfo {
    public final int seed;
    public final int sizeX;
    public final int sizeY;
    public final int ratio;
    public final int nTrials;
    
    public GraphInfo(int seed, int sizeX, int sizeY, int ratio, int nTrials) {
        this.seed = seed;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.ratio = ratio;
        this.nTrials = nTrials;
    }
    
}

class StartEndPointData {
    public final Point start;
    public final Point end;
    public final float shortestPath;
    
    public StartEndPointData(Point start, Point end, float shortestPath) {
        this.start = start;
        this.end = end;
        this.shortestPath = shortestPath;
    }
}

enum PathLengthClass {
    SHORTEST, // 0-25th percentile
    LOWER,    // 0-60th percentile
    MIDDLE,   // 25-75th percentile
    HIGHER,   // 40-100th percentile
    LONGEST,  // 75th-100th percentile
    ALL
}