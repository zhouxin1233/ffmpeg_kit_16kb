package com.arthenica.ffmpegkit;

public enum Abi {
   ABI_ARMV7A_NEON("armeabi-v7a-neon"),
   ABI_ARMV7A("armeabi-v7a"),
   ABI_ARM("armeabi"),
   ABI_X86("x86"),
   ABI_X86_64("x86_64"),
   ABI_ARM64_V8A("arm64-v8a"),
   ABI_UNKNOWN("unknown");

   private final String name;

   public static Abi from(String abiName) {
      if (abiName == null) {
         return ABI_UNKNOWN;
      } else if (abiName.equals(ABI_ARM.getName())) {
         return ABI_ARM;
      } else if (abiName.equals(ABI_ARMV7A.getName())) {
         return ABI_ARMV7A;
      } else if (abiName.equals(ABI_ARMV7A_NEON.getName())) {
         return ABI_ARMV7A_NEON;
      } else if (abiName.equals(ABI_ARM64_V8A.getName())) {
         return ABI_ARM64_V8A;
      } else if (abiName.equals(ABI_X86.getName())) {
         return ABI_X86;
      } else {
         return abiName.equals(ABI_X86_64.getName()) ? ABI_X86_64 : ABI_UNKNOWN;
      }
   }

   public String getName() {
      return this.name;
   }

   private Abi(String abiName) {
      this.name = abiName;
   }

   // $FF: synthetic method
   private static Abi[] $values() {
      return new Abi[]{ABI_ARMV7A_NEON, ABI_ARMV7A, ABI_ARM, ABI_X86, ABI_X86_64, ABI_ARM64_V8A, ABI_UNKNOWN};
   }
}
