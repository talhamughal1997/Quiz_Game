package com.example.talhamughal.k_b_c_game;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.opengl.Visibility;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;

public class PlayActivityDesign {

    protected static void ViewAnimations(final View view , long Duration , boolean Visibility)
    {
        if (Visibility == true) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                int x = view.getWidth() / 2;
                int y = view.getHeight() / 2 ;
                float radius = view.getWidth();
                Animator animator = ViewAnimationUtils.createCircularReveal(view, x, y, 0,radius);

                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        view.setVisibility(View.VISIBLE);
                    }

                });
                animator.setDuration(Duration);
                animator.start();

            } else {
                view.setVisibility(View.VISIBLE);
            }
        }
        else
        {
            ViewAnimations(view,Duration);
        }

    }

    protected static void ViewAnimations(final View view , long Duration)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int x = view.getWidth() / 2;
            int y = view.getHeight() / 2;
            float radius = view.getWidth();
            Animator animator = ViewAnimationUtils.createCircularReveal(view, x, y, radius, 0);

            animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    view.setVisibility(View.INVISIBLE);
                }

            });
            animator.setDuration(Duration);
            animator.start();

        } else {
            view.setVisibility(View.INVISIBLE);
        }

    }

    protected static void ViewAnimationsToggle(final View view , long Duration )
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int x = view.getWidth() / 2;
            int y = view.getHeight() / 2;
            float radius = view.getWidth();
            Animator animator = ViewAnimationUtils.createCircularReveal(view, x, y, radius, 0);

            animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    view.setVisibility(View.INVISIBLE);
                }

            });
            animator.setDuration(Duration);
            animator.start();

            radius = view.getWidth();
            animator = ViewAnimationUtils.createCircularReveal(view, x, y, 0, radius);

            animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    view.setVisibility(View.VISIBLE);
                }

            });
            animator.setDuration(Duration);
            animator.start();

        } else {
            view.setVisibility(View.VISIBLE);
        }

    }

}
