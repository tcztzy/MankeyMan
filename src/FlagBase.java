//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class FlagBase {
    int flags = 0;

    FlagBase() {
    }

    public final void setFlagTrue(int var1) {
        this.flags |= var1;
    }

    final void setFlagFalse(int var1) {
        this.flags &= ~var1;
    }

    final boolean getFlag(int var1) {
        return (this.flags & var1) != 0;
    }
}
