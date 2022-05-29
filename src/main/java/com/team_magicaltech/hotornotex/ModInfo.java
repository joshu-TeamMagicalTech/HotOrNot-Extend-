package com.team_magicaltech.hotornotex;

import net.minecraftforge.fml.common.ModMetadata;

public class ModInfo {

    public static void loadInfo(ModMetadata meta){
        meta.modId = HotOrNotExtend.MOD_ID;
        meta.name = HotOrNotExtend.MOD_NAME;
        meta.description ="I modified Buuz135's Hot or Not and added a few elements.       " +
                "The MIT License Copyright (c) <2018> <Buuz135> " +
                "Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files(the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. " +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.";
        meta.version =HotOrNotExtend.VERSION ;
        meta.url = "https://github.com/joshu-TeamMagicalTech/HotOrNot-Extend-";
        meta.authorList.add("Team MagicalTech");
        meta.credits = "original author:Buuz135";
        meta.autogenerated = false;
    }
}