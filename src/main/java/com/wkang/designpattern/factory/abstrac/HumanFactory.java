package com.wkang.designpattern.factory.abstrac;

/**
 * @author wkang
 * @description:
 * @since 2022/3/10 17:04
 */
public interface HumanFactory {
      public Human createBlackHuman();

      public Human createWhiteHuman();

      public Human createYellowHuman();

}
