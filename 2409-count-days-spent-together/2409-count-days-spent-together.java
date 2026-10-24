class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int[] days = new int[13];
        days[1] = 31;
        days[2] = 28;
        days[3] = 31;
        days[4] = 30;
        days[5] = 31;
        days[6] = 30;
        days[7] = 31;
        days[8] = 31;
        days[9] = 30;
        days[10] = 31;
        days[11] = 30;
        days[12] = 31;

        int aliceStart = convert(arriveAlice, days);
        int aliceEnd = convert(leaveAlice, days);
        int bobStart = convert(arriveBob, days);
        int bobEnd = convert(leaveBob, days);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }

    public int convert(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 1; i < month; i++) {
            day += days[i];
        }

        return day;
    }
}