package api.Util;

import java.text.DecimalFormat;

public class FormatSet {
    // 소수점 2자리 포맷 반환
    private static final DecimalFormat df = new DecimalFormat("#,##0.00");

    public static String formatAvg(double value) {
        return df.format(value);
    }
}

