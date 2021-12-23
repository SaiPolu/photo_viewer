package com.example.myapplication.slice;

        import com.example.myapplication.ResourceTable;
        import com.example.photo_viewer.Photoviewer;
        import ohos.aafwk.ability.AbilitySlice;
        import ohos.aafwk.content.Intent;
        import ohos.agp.animation.AnimatorProperty;
        import ohos.agp.components.Image;
        import ohos.agp.components.Slider;
        import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    AnimatorProperty animatorProperty;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Photoviewer P = (Photoviewer) findComponentById(ResourceTable.Media_img);
        P.setContext(this);


    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

}


