package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        // Find the smallest number of jumps required to get to specified(selection) song in playlist

        int countRight = 0;
        int countLeft = 0;

        for (int i = startIndex; selection != playList[i]; i++) {
            countRight++;

            if(i == playList.length - 1 )
                i = 0;
        }

        for (int i = startIndex; selection != playList[i]; i--) {
                countLeft++;

            if( i == 0)
                i = playList.length;

        }

        if(countLeft < countRight)
            return countLeft;

        else return countRight;
    }
}
