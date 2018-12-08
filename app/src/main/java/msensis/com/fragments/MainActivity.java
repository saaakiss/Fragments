package msensis.com.fragments;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SectionsStatePageAdapter mSectionsStatePageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        mSectionsStatePageAdapter = new SectionsStatePageAdapter(getSupportFragmentManager());
        mSectionsStatePageAdapter.addFragment(new Fragment1());
        mSectionsStatePageAdapter.addFragment(new Fragment2());
        mSectionsStatePageAdapter.addFragment(new Fragment3());
        viewPager.setAdapter(mSectionsStatePageAdapter);
    }

    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
