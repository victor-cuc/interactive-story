package com.victorcuc.signalsfrommars.model;

import com.victorcuc.signalsfrommars.R;

public class Story {
    private Page[] pages;

    public Story() {
        pages = new Page[7];

        pages[0] = new Page(
                R.drawable.page0,
                R.string.page0,
                new Choice(R.string.page0_choice1, 3),
                new Choice(R.string.page0_choice2, 2));

        pages[2] = new Page(R.drawable.page2,
                R.string.page2,
                new Choice(R.string.page2_choice1, 4),
                new Choice(R.string.page2_choice2, 6));

        pages[3] = new Page(R.drawable.page3,
                R.string.page3,
                new Choice(R.string.page3_choice1, 4),
                new Choice(R.string.page3_choice2, 5));

        pages[4] = new Page(R.drawable.page4,
                R.string.page4,
                new Choice(R.string.page4_choice1, 5),
                new Choice(R.string.page4_choice2, 6));

        pages[5] = new Page(R.drawable.page5, R.string.page5);

        pages[6] = new Page(R.drawable.page6, R.string.page6);
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}
