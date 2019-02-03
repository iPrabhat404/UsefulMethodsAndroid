
//Hide and Show soft keyboard Android
public static void showKeyboard(Activity activity, View view) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInputFromWindow(view.getWindowToken(), InputMethodManager.SHOW_FORCED, 0);
    }

    public static void hideKeyboard(Activity activity, View view) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
