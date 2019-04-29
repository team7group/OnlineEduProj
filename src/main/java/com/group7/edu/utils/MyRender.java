package com.group7.edu.utils;

import com.google.code.kaptcha.GimpyEngine;

import java.awt.image.BufferedImage;

public class MyRender implements GimpyEngine {
    @Override
    public BufferedImage getDistortedImage(BufferedImage baseImage) {
        return baseImage;
    }
}