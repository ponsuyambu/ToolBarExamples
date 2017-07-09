    package com.bnpp.toolbarexample;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.bnpp.toolbarexample.fragments.ItemFragment;
import com.bnpp.toolbarexample.fragments.dummy.DummyContent;

    public class AppBarUnderstanding extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener{

        Toolbar toolbar;
        LinearLayout toolBarContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_understanding);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolBarContainer = (LinearLayout) findViewById(R.id.llToolbarContainer);

        //setSupportActionBar(toolbar);
//        toolbar.inflateMenu(R.menu.menu_main);
//        toolbar.setTitle("Title");
//        toolbar.setSubtitle("Subtitle");
        toolbar.setNavigationIcon(R.drawable.ic_android_black_24dp);

        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBar);

        //Setting scrolling flags programmatically


        //Tab layout
//            <android.support.design.widget.TabLayout
//            android:id="@+id/tabLayout"
//            android:visibility="gone"
//            android:layout_width="match_parent"
//            android:layout_height="40dp"/>
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        tabLayout.addTab(tabLayout.newTab().setText("One"));
//        tabLayout.addTab(tabLayout.newTab().setText("two"));
//        tabLayout.addTab(tabLayout.newTab().setText("three"));

        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,new ItemFragment()).commit();
    }

        @Override
        public void onListFragmentInteraction(DummyContent.DummyItem item) {

        }

//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            getMenuInflater().inflate(R.menu.menu_main,menu);
//            return super.onCreateOptionsMenu(menu);
//        }

        public void enableAppBarScrolling(){
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) toolBarContainer.getLayoutParams();
            layoutParams.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS| AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL);
        }

        public void disableAppBarScrolling(){
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) toolBarContainer.getLayoutParams();
            layoutParams.setScrollFlags(0);
        }
    }
