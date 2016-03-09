package fr.heritiers.ModSDA.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.heritiers.ModSDA.blocks.Barrel;
import fr.heritiers.ModSDA.blocks.BarrelSide;
import fr.heritiers.ModSDA.blocks.BlocLink;
import fr.heritiers.ModSDA.blocks.BlockFluid;
import fr.heritiers.ModSDA.blocks.Bookshelf;
import fr.heritiers.ModSDA.blocks.Branch;
import fr.heritiers.ModSDA.blocks.BranchRock;
import fr.heritiers.ModSDA.blocks.Colombage;
import fr.heritiers.ModSDA.blocks.CraftingTable;
import fr.heritiers.ModSDA.blocks.Dirt;
import fr.heritiers.ModSDA.blocks.Etendard;
import fr.heritiers.ModSDA.blocks.FloorDecoration;
import fr.heritiers.ModSDA.blocks.Flower;
import fr.heritiers.ModSDA.blocks.Furnace;
import fr.heritiers.ModSDA.blocks.Grass;
import fr.heritiers.ModSDA.blocks.GrassBloc;
import fr.heritiers.ModSDA.blocks.GrassBlocColor;
import fr.heritiers.ModSDA.blocks.Gravel;
import fr.heritiers.ModSDA.blocks.Haze;
import fr.heritiers.ModSDA.blocks.Leave;
import fr.heritiers.ModSDA.blocks.LeaveOpaque;
import fr.heritiers.ModSDA.blocks.LeavesFloor;
import fr.heritiers.ModSDA.blocks.Lingot;
import fr.heritiers.ModSDA.blocks.Log;
import fr.heritiers.ModSDA.blocks.Mineral;
import fr.heritiers.ModSDA.blocks.MossyRock;
import fr.heritiers.ModSDA.blocks.MuralDecoration;
import fr.heritiers.ModSDA.blocks.MuralDecorationMulti;
import fr.heritiers.ModSDA.blocks.NewFluid;
import fr.heritiers.ModSDA.blocks.Paille;
import fr.heritiers.ModSDA.blocks.Rock;
import fr.heritiers.ModSDA.blocks.RockLighted;
import fr.heritiers.ModSDA.blocks.Sand;
import fr.heritiers.ModSDA.blocks.SandPile;
import fr.heritiers.ModSDA.blocks.Slab;
import fr.heritiers.ModSDA.blocks.Stair;
import fr.heritiers.ModSDA.blocks.Thatch;
import fr.heritiers.ModSDA.blocks.Torch;
import fr.heritiers.ModSDA.blocks.TriplePlant;
import fr.heritiers.ModSDA.blocks.TriplePlantDifferent;
import fr.heritiers.ModSDA.blocks.VerticalSlab;
import fr.heritiers.ModSDA.blocks.Vine;
import fr.heritiers.ModSDA.blocks.Vitre;
import fr.heritiers.ModSDA.blocks.Wall;
import fr.heritiers.ModSDA.blocks.Wood;
import fr.heritiers.ModSDA.items.Bucket;
import fr.heritiers.ModSDA.proxy.CommonProxy;
import fr.heritiers.ModSDA.slabItems.ItemDalle;
import fr.heritiers.ModSDA.tileentity.FurnaceEntity;
import fr.heritiers.ModSDA.weapons.BasicAxe;
import fr.heritiers.ModSDA.weapons.BasicBow;
import fr.heritiers.ModSDA.weapons.BasicSpear;
import fr.heritiers.ModSDA.weapons.BasicSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid="modsda", name="Mod Heritiers", version="0.1")
public class ModSDA {
    public static final String MODID = "modsda";
    @Mod.Instance(value="modsda")
    public static ModSDA instance;
    @SidedProxy(clientSide="fr.heritiers.ModSDA.proxy.ClientProxy", serverSide="fr.heritiers.ModSDA.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    
    public static Block verticalStairThatch;
    public static Block branchpaille2;
    public static Block slabpaille2;
    public static Block doubleSlabpaille2;
    public static Block verticalSlabpaille2;
    public static Block quicksandnew;
    public static Block stairquicksandnew;
    public static Block slabquicksandnew;
    public static Block doubleSlabquicksandnew;
    public static Block wallquicksandnew;
    public static Block verticalquicksandnew;
    public static Block farmland1;
    public static Block farmland2;
    public static Block blackrocknew;
    public static Block stairblackrocknew;
    public static Block slabblackrocknew;
    public static Block doubleSlabblackrocknew;
    public static Block wallblackrocknew;
    public static Block verticalblackrocknew;
    public static Block crackedsandNew;
    public static Block staircrackedsandNew;
    public static Block slabcrackedsandNew;
    public static Block doubleSlabcrackedsandNew;
    public static Block wallcrackedsandNew;
    public static Block verticalcrackedsandNew;
    public static Block end_bricks;
    public static Block stairend_bricks;
    public static Block slabend_bricks;
    public static Block doubleSlabend_bricks;
    public static Block wallend_bricks;
    public static Block verticalend_bricks;
    public static Block end_stone;
    public static Block stairend_stone;
    public static Block slabend_stone;
    public static Block doubleSlabend_stone;
    public static Block wallend_stone;
    public static Block verticalend_stone;   
    public static Block diamond_blockNew;
    public static Block emerald_blockNew;
    public static Block gold_blockNew;
    public static Block iron_blockNew;
    public static Block lapis_blockNew;
    public static Block branchsandbrick3;
    public static Block branchsandbrick2;
    public static Block branchsandbrick;
    public static Block branchpavesand;
    public static Block branchorange_sandstone;
    public static Block branchorange_sandstone_normal;
    public static Block branchb_rochedale;
    public static Block branchb_pierredale;
    public static Block branchb_briquedale;
    public static Block branchStonebrickbase;
    public static Block branchStonebase;
    public static Block branchStonebrickwhite;
    public static Block branchStonebrickDark;
    public static Block branchStonebrick;
    public static Block cobbleStoneDarknew;
    public static Block staircobbleStoneDarknew;
    public static Block slabcobbleStoneDarknew;
    public static Block doubleSlabcobbleStoneDarknew;
    public static Block wallcobbleStoneDarknew;
    public static Block verticalSlabcobbleStoneDarknew;
    public static Block stoneBrickDarkNew;
    public static Block stairstoneBrickDarkNew;
    public static Block slabstoneBrickDarkNew;
    public static Block doubleSlabstoneBrickDarkNew;
    public static Block wallstoneBrickDarkNew;
    public static Block verticalSlabstoneBrickDarkNew;
    public static Block stoneBrickCarvedDarkNew;
    public static Block stairstoneBrickCarvedDarkNew;
    public static Block slabstoneBrickCarvedDarkNew;
    public static Block doubleSlabstoneBrickCarvedDarkNew;
    public static Block wallstoneBrickCarvedDarkNew;
    public static Block verticalSlabstoneBrickCarvedDarkNew;
    public static Block stoneDarkNew;
    public static Block stairstoneDarkNew;
    public static Block slabstoneDarkNew;
    public static Block doubleSlabstoneDarkNew;
    public static Block wallstoneDarkNew;
    public static Block verticalSlabstoneDarkNew;
    public static Block sableBlanc;
    public static Block stairsableBlanc;
    public static Block slabsableBlanc;
    public static Block doubleSlabsableBlanc;
    public static Block wallsableBlanc;
    public static Block verticalSlabsableBlanc;
    public static Block sableBlanc2;
    public static Block stairsableBlanc2;
    public static Block slabsableBlanc2;
    public static Block doubleSlabsableBlanc2;
    public static Block wallsableBlanc2;
    public static Block verticalSlabsableBlanc2;
    public static Block sableBlanc3;
    public static Block stairsableBlanc3;
    public static Block slabsableBlanc3;
    public static Block doubleSlabsableBlanc3;
    public static Block wallsableBlanc3;
    public static Block verticalSlabsableBlanc3;
    public static Block logChataignierNew;
    public static Block branchChataignierNew;
    public static Block planksChataignierNew;
    public static Block stairPlanksChataignierNew;
    public static Block slabPlanksChataignierNew;
    public static Block doubleSlabPlanksChataignierNew;
    public static Block wallPlanksChataignierNew;
    public static Block verticalSlabPlanksChataignierNew;
    public static Block logMallornNew;
    public static Block branchMallornNew;
    public static Block planksMallornNew;
    public static Block stairPlanksMallornNew;
    public static Block slabPlanksMallornNew;
    public static Block doubleSlabPlanksMallornNew;
    public static Block wallPlanksMallornNew;
    public static Block verticalSlabPlanksMallornNew;
    public static Block blockTutoriel2;
    public static Block stoneBrickCrackednew;
    public static Block stairstoneBrickCrackednew;
    public static Block slabstoneBrickCrackednew;
    public static Block doubleSlabstoneBrickCrackednew;
    public static Block wallstoneBrickCrackednew;
    public static Block verticalSlabstoneBrickCrackednew;
    public static Block stoneBrickSmoothnew;
    public static Block stairstoneBrickSmoothnew;
    public static Block slabstoneBrickSmoothnew;
    public static Block doubleSlabstoneBrickSmoothnew;
    public static Block wallstoneBrickSmoothnew;
    public static Block verticalSlabstoneBrickSmoothnew;
    public static Block stonebrickdarknew;
    public static Block stairstonebrickdarknew;
    public static Block slabstonebrickdarknew;
    public static Block doubleSlabstonebrickdarknew;
    public static Block wallstonebrickdarknew;
    public static Block verticalSlabstonebrickdarknew;
    public static Block stonebrickgreynew;
    public static Block stairstonebrickgreynew;
    public static Block slabstonebrickgreynew;
    public static Block doubleSlabstonebrickgreynew;
    public static Block wallstonebrickgreynew;
    public static Block verticalSlabstonebrickgreynew;
    public static Block stonebrickwhitenew;
    public static Block stairstonebrickwhitenew;
    public static Block slabstonebrickwhitenew;
    public static Block doubleSlabstonebrickwhitenew;
    public static Block wallstonebrickwhitenew;
    public static Block verticalSlabstonebrickwhitenew;
    public static Block orange_sandstonenew;
    public static Block stairorange_sandstonenew;
    public static Block slaborange_sandstonenew;
    public static Block doubleSlaborange_sandstonenew;
    public static Block wallorange_sandstonenew;
    public static Block verticalSlaborange_sandstonenew;
    public static Block orange_sandstone_normalnew;
    public static Block stairorange_sandstone_normalnew;
    public static Block slaborange_sandstone_normalnew;
    public static Block doubleSlaborange_sandstone_normalnew;
    public static Block wallorange_sandstone_normalnew;
    public static Block verticalSlaborange_sandstone_normalnew;
    public static Block bibliothequenew;
    public static Block bibliothequenewmilieu;
    public static Block bibliothequenewdroite;
    public static Block bibliothequenewgauche;
    public static Fluid blood;
    public static Fluid waterNotFreezing;
    public static Fluid ironFluid;
    public static Fluid mithrilFluid;
    public static Fluid silverFluid;
    public static Fluid goldFluid;
    public static Fluid rubisFluid;
    public static Fluid saphirFluid;
    public static Fluid diamantFluid;
    public static Fluid coalFluid;
    public static Fluid emeraudFluid;
    public static Block blockBlood;
    public static Block blockWaterNotFreezing;
    public static Block blockIronFluid;
    public static Block blockMithrilFluid;
    public static Block blockSilverFluid;
    public static Block blockGoldFluid;
    public static Block blockRubisFluid;
    public static Block blockSaphirFluid;
    public static Block blockDiamantFluid;
    public static Block blockCoalFluid;
    public static Block blockEmeraudFluid;
    public static Item bucketBlood;
    public static Item bucketWaterNotFreezing;
    public static Item bucketIronFluid;
    public static Item bucketMithrilFluid;
    public static Item bucketSilverFluid;
    public static Item bucketGoldFluid;
    public static Item bucketRubisFluid;
    public static Item bucketSaphirFluid;
    public static Item bucketDiamantFluid;
    public static Item bucketCoalFluid;
    public static Item bucketEmeraudFluid;
    public static Block darkGravel;
    public static Block darkDirtGravel;
    public static Block cobblestoneDale;
    public static Block lightGravel;
    public static Block darkDirt;
    public static Block dirtGravel;
    public static Block pierreTailleeSombre;
    public static Block pave;
    public static Block daleStone;
    public static Block pierreTailleeDale;
    public static Block etagereBouteilleFull;
    public static Block colombageBlancSlash;
    public static Block colombageBlancAntislash;
    public static Block colombageBlancCroix;
    public static Block colombageBlancCirconflexe;
    public static Block colombageBlancV;
    public static Block colombageMarronSlash;
    public static Block colombageMarronAntislash;
    public static Block colombageMarronCroix;
    public static Block colombageMarronCirconflexe;
    public static Block colombageMarronV;
    public static Block stonebrickcrackwhite;
    public static Block stonebrickcrackgrey;
    public static Block stonebrickcrackdark;
    public static Block stonebrickWhite;
    public static Block stonebrickgrey;
    public static Block stonebrickdark;
    public static Block darkGrayStone;
    public static Block grayStone;
    public static Block whiteStone;
    public static Block darkStoneTaille;
    public static Block etagereBouteilleGauche;
    public static Block etagereBouteilleMilieu;
    public static Block etagereBouteilleDroite;
    public static Block placardGauche;
    public static Block placardMilieu;
    public static Block placardDroite;
    public static Block placardFull;
    public static Block redSand;
    public static Block plankNewAcacia;
    public static Block plankNewBigOak;
    public static Block plankNewBirch;
    public static Block plankNewJungle;
    public static Block plankNewOak;
    public static Block plankNewSpruce;
    public static Block sandrune;
    public static Block sandrune2;
    public static Block sandrune3;
    public static Block colombageClairPlus;
    public static Block colombageClairV;
    public static Block colombageClairTube;
    public static Block colombageClairOgive;
    public static Block colombageClairVide;
    public static Block blackStone;
    public static Block paveCarnDum;
    public static Block stoneBrickBlue;
    public static Block stoneBrickGreen;
    public static Block escalierDaleStone;
    public static Block granite;
    public static Block lime;
    public static Block copperblock;
    public static Block grosseBriqueGresTaille;
    public static Block gresCiselle;
    public static Block sable;
    public static Block pilierBas;
    public static Block pilierMilieu;
    public static Block pilierHaut;
    public static Block stairgresCiselleDore;
    public static Block stairBriqueGresDore;
    public static Block stairBlueStone;
    public static Block stairStoneBrickBis;
    public static Block stairBlackStone;
    public static Block stairBlackStone2;
    public static Block stairPaveCarnDum;
    public static Block stairNetherrack;
    public static Block stairBrownBrick;
    public static Block stairsGrosseBriqueGresTaille;
    public static Block stairGresCiselle;
    public static Block stairCobblestoneDale;
    public static Block stairPierreTailleeSombre;
    public static Block stairPave;
    public static Block stairStoneBrickBlue;
    public static Block stairStoneBrickGreen;
    public static Block stairLime;
    public static Block stairGranite;
    public static Block rockMorgul;
    public static Block beton;
    public static Block stairPierreTailleeDale;
    public static Block stairStonebrickCrackedWhite;
    public static Block stairStonebrickCrackedGrey;
    public static Block stairStonebrickCrackedDark;
    public static Block stairStonebrickWhite;
    public static Block stairStonebrickDark;
    public static Block stairStoneBrickGrey;
    public static Block escalierWhiteStone;
    public static Block stairDarkGrayStone;
    public static Block stairGrayStone;
    public static Block stairsDarkStoneTaille;
    public static Block escalierPaille;
    public static Block b_pave2Blood;
    public static Block b_paveBlood;
    public static Block b_stonebrickdark2Blood;
    public static Block orange_sandstone_normalBlood;
    public static Block pavesandBlood;
    public static Block sandbrick2Blood;
    public static Block sandbrick3Blood;
    public static Block sandbrickBlood;
    public static Block stoneBrickBis2Blood;
    public static Block stonebrickbisBlood;
    public static Block stoneBrickCrackedBlood;
    public static Block stoneBrickSmoothBlood;
    public static Block stairBriqueGresFonce;
    public static Block stairBriqueGresSculpte;
    public static Block stairBriqueGresTaille;
    public static Block netherrack;
    public static Block brownBrick;
    public static Block braise;
    public static Block stairBriqueRochGriseTaillee;
    public static Block blackStone2;
    public static Block blocinvisible;
    public static Block blocinvisibleBis;
    public static Block blocinvisibleTer;
    public static Block stoneBrickBis;
    public static Block gresCiselleDore;
    public static Block briqueGresDore;
    public static Block goldenIngot;
    public static Block ironIngot;
    public static Block barrelMushrooms;
    public static Block barrelFish;
    public static Block barrelCookies;
    public static Block barrelEye;
    public static Block barrelSalmon;
    public static Block barrelSalmonBis;
    public static Block barrelTools;
    public static Block barrelCardGame;
    public static Block barrelApple;
    public static Block barrelBasic;
    public static Block barrelPaper;
    public static Block briqueRocheGriseTaillee;
    public static Block briqueGresTaille;
    public static Block gresTaille;
    public static Block briqueGresFonce;
    public static Block briqueGresSculpte;
    public static Block blueStone;
    public static Block vitreArcDroit;
    public static Block vitreQuadrillage;
    public static Block vitreArcGauche;
    public static Block vitreMotif;
    public static Block vitreTraitQuadrillageDroite;
    public static Block vitreTraitQuadrillageGauche;
    public static Block vitreMotifInverse;
    public static Block vitreTraitQuadrillageDroiteBis;
    public static Block vitreTraitQuadrillageGaucheBis;
    public static Block vitreCarreQuadrille;
    public static Block colombageblanc;
    public static Block colombageBlancVide;
    public static Block colombageMarronVide;
    public static Block stairGresTaille;
    public static Block barrelCoal;
    public static Block bibliothequeBis;
    public static Block bibliothequeBis2;
    public static Block hellSand;
    public static Block skyrootLeaves;
    public static Block goldenOakLeaves;
    public static Block leavesSpruce;
    public static Block briqueNoireAngmar;
    public static Block stoneBrickCarved;
    public static Block briqueCraqueleeAngmar;
    public static Block briqueNoireMoussueAngmar;
    public static Block briqueNoireAngmar2;
    public static Block briqueNoireMoussueAngmar2;
    public static Block blockBird;
    public static Block blockBird2;
    public static Block blockDragon;
    public static Block blockDragon2;
    public static Block blockHorse;
    public static Block blockWolf;
    public static Block etain;
    public static Block cuivre;
    public static Block electrum;
    public static Block mithril;
    public static Block rubis;
    public static Block saphir;
    public static Block saphirBis;
    public static Block saphirTer;
    public static Block soufre;
    public static Block zinc;
    public static Block zincBis;
    public static Block paille2;
    public static Block biblioparchermin;
    public static Block biblioparchemindroite;
    public static Block biblioparchemingauche;
    public static Block biblioparcheminmilieu;
    public static Block stairBriqueNoireAngmar;
    public static Block stairStoneBrickCaqueleeAngmar;
    public static Block stairBriqueNoireMoussueAngmar;
    public static Block stairBriqueNoireAngmar2;
    public static Block stairBriqueNoireMoussueAngmar2;
    public static Block leavesMallorn;
    public static Block dirtPodzol;
    public static Block driedGrass;
    public static Block stoneTree;
    public static Block echec;
    public static Block benchCalligraphie;
    public static Block barrelCoalBis;
    public static Block stairPlankNewAcacia;
    public static Block stairPlankNewBigOak;
    public static Block stairPlankNewBirch;
    public static Block stairPlankNewJungle;
    public static Block stairPlankNewOak;
    public static Block stairPlankNewSpruce;
    public static Block stairPlankAcaciaPolished;
    public static Block stairPlankBigOakPolished;
    public static Block stairPlankBirchPolished;
    public static Block stairPlankJunglePolished;
    public static Block stairPlankOakPolished;
    public static Block stairPlankSprucePolished;
    public static Block slabPlankNewAcacia;
    public static Block slabPlankNewBigOak;
    public static Block slabPlankNewBirch;
    public static Block slabPlankNewJungle;
    public static Block slabPlankNewOak;
    public static Block slabPlankNewSpruce;
    public static Block slabPlankAcaciaPolished;
    public static Block slabPlankBigOakPolished;
    public static Block slabPlankBirchPolished;
    public static Block slabPlankJunglePolished;
    public static Block slabPlankOakPolished;
    public static Block slabPlankSprucePolished;
    public static Block doubleSlabPlankNewAcacia;
    public static Block doubleSlabPlankNewBigOak;
    public static Block doubleSlabPlankNewBirch;
    public static Block doubleSlabPlankNewJungle;
    public static Block doubleSlabPlankNewOak;
    public static Block doubleSlabPlankNewSpruce;
    public static Block doubleSlabPlankAcaciaPolished;
    public static Block doubleSlabPlankBigOakPolished;
    public static Block doubleSlabPlankBirchPolished;
    public static Block doubleSlabPlankJunglePolished;
    public static Block doubleSlabPlankOakPolished;
    public static Block doubleSlabPlankSprucePolished;
    public static Block bookshelfEmpty;
    public static Block bookshelf2;
    public static Block bookshelf3;
    public static Block bookshelf4;
    public static Block bookshelf5;
    public static Block bookshelf6;
    public static Block bookshelfBisEmpty;
    public static Block bookshelfBis2;
    public static Block bookshelfBis3;
    public static Block bookshelfBis4;
    public static Block bookshelfBis5;
    public static Block bookshelfTer;
    public static Block bookshelfTer2;
    public static Block bookshelfTer3;
    public static Block bookshelfTer4;
    public static Block bookshelfTer5;
    public static Block bookshelfTer6;
    public static Block bookshelfTer7;
    public static Block bookshelfTer8;
    public static Block leavesAutumnYellow;
    public static Block leavesAutumnOrange;
    public static Block leavesAutumnRed;
    public static Block leavesAutumnBrown;
    public static Block leavesCypres;
    public static Block leavesEucalyptus;
    public static Block leavesFir;
    public static Block leavesPalm;
    public static Block leavesCoffeePlant;
    public static Block leavesGrapeFruit;
    public static Block leavesLemon;
    public static Block leavesOrange;
    public static Block leavesSakura;
    public static Block logAsh;
    public static Block logEucalyptus;
    public static Block logPalm;
    public static Block b_stonebrickgrey_blood;
    public static Block b_stonebrickwhite_blood;
    public static Block b_stonebrickdark_blood;
    public static Block leavesFloorSpruce;
    public static Block leavesFloorOak;
    public static Block leavesFloorBirch;
    public static Block leavesFloorJungle;
    public static Block leavesFloorGolden;
    public static Block leavesFloorGreen;
    public static Block leavesFloorPink;
    public static Block leavesFloorSakura;
    public static Block leavesFloorAutumnYellow;
    public static Block leavesFloorAutumnOrange;
    public static Block leavesFloorAutumnRed;
    public static Block leavesFloorAutumnBrown;
    public static Block pilierBasGres;
    public static Block pilierMilieuGres;
    public static Block pilierHautGres;
    public static Block stairStone;
    public static Block stone1;
    public static Block slabStone;
    public static Block doubleSlabStone;
    public static Block verticalSlabStone1;
    public static Block logChataignier;
    public static Block logLiquidambar;
    public static Block logMallorn;
    public static Block logSaule;
    public static Block planksChataignier;
    public static Block planksLiquidambar;
    public static Block planksMallorn;
    public static Block planksSaule;
    public static Block stairPlanksChataignier;
    public static Block stairPlanksLiquidambar;
    public static Block stairPlanksMallorn;
    public static Block stairPlanksSaule;
    public static Block wallPlanksChataignier;
    public static Block wallPlanksLiquidambar;
    public static Block wallPlanksMallorn;
    public static Block wallPlanksSaule;
    public static Block slabPlanksChataignier;
    public static Block slabPlanksLiquidambar;
    public static Block slabPlanksMallorn;
    public static Block slabPlanksSaule;
    public static Block doubleSlabPlanksChataignier;
    public static Block doubleSlabPlanksLiquidambar;
    public static Block doubleSlabPlanksMallorn;
    public static Block doubleSlabPlanksSaule;
    public static Block verticalSlabPlanksChataignier;
    public static Block verticalSlabPlanksLiquidambar;
    public static Block verticalSlabPlanksMallorn;
    public static Block verticalSlabPlanksSaule;
    public static Block plankAcaciaPolished;
    public static Block plankBigOakPolished;
    public static Block plankBirchPolished;
    public static Block plankJunglePolished;
    public static Block plankOakPolished;
    public static Block plankSprucePolished;
    public static Block stairWoolWhite;
    public static Block stairWoolOrange;
    public static Block stairWoolMagenta;
    public static Block stairWoolLightBlue;
    public static Block stairWoolYellow;
    public static Block stairWoolLightGreen;
    public static Block stairWoolPink;
    public static Block stairWoolGrey;
    public static Block stairWoolLightGrey;
    public static Block stairWoolCyan;
    public static Block stairWoolPurple;
    public static Block stairWoolBlue;
    public static Block stairWoolBrown;
    public static Block stairWoolGreen;
    public static Block stairWoolRed;
    public static Block stairWoolBlack;
    public static Block slabWoolWhite;
    public static Block slabWoolOrange;
    public static Block slabWoolMagenta;
    public static Block slabWoolLightBlue;
    public static Block slabWoolYellow;
    public static Block slabWoolLightGreen;
    public static Block slabWoolPink;
    public static Block slabWoolGrey;
    public static Block slabWoolLightGrey;
    public static Block slabWoolCyan;
    public static Block slabWoolPurple;
    public static Block slabWoolBlue;
    public static Block slabWoolBrown;
    public static Block slabWoolGreen;
    public static Block slabWoolRed;
    public static Block slabWoolBlack;
    public static Block doubleSlabWoolWhite;
    public static Block doubleSlabWoolOrange;
    public static Block doubleSlabWoolMagenta;
    public static Block doubleSlabWoolLightBlue;
    public static Block doubleSlabWoolYellow;
    public static Block doubleSlabWoolLightGreen;
    public static Block doubleSlabWoolPink;
    public static Block doubleSlabWoolGrey;
    public static Block doubleSlabWoolLightGrey;
    public static Block doubleSlabWoolCyan;
    public static Block doubleSlabWoolPurple;
    public static Block doubleSlabWoolBlue;
    public static Block doubleSlabWoolBrown;
    public static Block doubleSlabWoolGreen;
    public static Block doubleSlabWoolRed;
    public static Block doubleSlabWoolBlack;
    public static Block verticalSlabWoolWhite;
    public static Block verticalSlabWoolOrange;
    public static Block verticalSlabWoolMagenta;
    public static Block verticalSlabWoolLightBlue;
    public static Block verticalSlabWoolYellow;
    public static Block verticalSlabWoolLightGreen;
    public static Block verticalSlabWoolPink;
    public static Block verticalSlabWoolGrey;
    public static Block verticalSlabWoolLightGrey;
    public static Block verticalSlabWoolCyan;
    public static Block verticalSlabWoolPurple;
    public static Block verticalSlabWoolBlue;
    public static Block verticalSlabWoolBrown;
    public static Block verticalSlabWoolGreen;
    public static Block verticalSlabWoolRed;
    public static Block verticalSlabWoolBlack;
    public static Block stairClayWhite;
    public static Block stairClayOrange;
    public static Block stairClayMagenta;
    public static Block stairClayLightBlue;
    public static Block stairClayYellow;
    public static Block stairClayLightGreen;
    public static Block stairClayPink;
    public static Block stairClayGrey;
    public static Block stairClayLightGrey;
    public static Block stairClayCyan;
    public static Block stairClayPurple;
    public static Block stairClayBlue;
    public static Block stairClayBrown;
    public static Block stairClayGreen;
    public static Block stairClayRed;
    public static Block stairClayBlack;
    public static Block slabClayWhite;
    public static Block slabClayOrange;
    public static Block slabClayMagenta;
    public static Block slabClayLightBlue;
    public static Block slabClayYellow;
    public static Block slabClayLightGreen;
    public static Block slabClayPink;
    public static Block slabClayGrey;
    public static Block slabClayLightGrey;
    public static Block slabClayCyan;
    public static Block slabClayPurple;
    public static Block slabClayBlue;
    public static Block slabClayBrown;
    public static Block slabClayGreen;
    public static Block slabClayRed;
    public static Block slabClayBlack;
    public static Block doubleSlabClayWhite;
    public static Block doubleSlabClayOrange;
    public static Block doubleSlabClayMagenta;
    public static Block doubleSlabClayLightBlue;
    public static Block doubleSlabClayYellow;
    public static Block doubleSlabClayLightGreen;
    public static Block doubleSlabClayPink;
    public static Block doubleSlabClayGrey;
    public static Block doubleSlabClayLightGrey;
    public static Block doubleSlabClayCyan;
    public static Block doubleSlabClayPurple;
    public static Block doubleSlabClayBlue;
    public static Block doubleSlabClayBrown;
    public static Block doubleSlabClayGreen;
    public static Block doubleSlabClayRed;
    public static Block doubleSlabClayBlack;
    public static Block verticalSlabClayWhite;
    public static Block verticalSlabClayOrange;
    public static Block verticalSlabClayMagenta;
    public static Block verticalSlabClayLightBlue;
    public static Block verticalSlabClayYellow;
    public static Block verticalSlabClayLightGreen;
    public static Block verticalSlabClayPink;
    public static Block verticalSlabClayGrey;
    public static Block verticalSlabClayLightGrey;
    public static Block verticalSlabClayCyan;
    public static Block verticalSlabClayPurple;
    public static Block verticalSlabClayBlue;
    public static Block verticalSlabClayBrown;
    public static Block verticalSlabClayGreen;
    public static Block verticalSlabClayRed;
    public static Block verticalSlabClayBlack;
    public static Block thatch;
    public static Block stairThatch;
    public static Block slabThatch;
    public static Block doubleSlabThatch;
    public static Block verticalSlabThatch;
    public static Block wallBriqueGresTaille;
    public static Block wallGresTaille;
    public static Block wallGrosseBriqueGresTaille;
    public static Block wallBriqueGresSculpte;
    public static Block wallGresCiselle;
    public static Block wallSable;
    public static Block wallPierreTailleeVerte;
    public static Block wallPierreTailleeBleue;
    public static Block wallPierreTailleeGrise;
    public static Block wallPierreTailleeFoncee;
    public static Block wallPierreTailleeBlanche;
    public static Block wallPierreTailleeFonceeCisellee;
    public static Block wallPierreTailleeGriseCisellee;
    public static Block wallPierreTailleeBlancheCisellee;
    public static Block wallPierreTailleeDale;
    public static Block wallPave;
    public static Block wallPierreTailleeSombre;
    public static Block wallCobblestoneDale;
    public static Block wallDarkStoneTaille;
    public static Block wallBriqueRocheGriseTaillee;
    public static Block wallBriqueGresFonce;
    public static Block wallBrownBrick;
    public static Block wallPaveCarnDum;
    public static Block wallDaleStone;
    public static Block wallWhiteStone;
    public static Block wallGrayStone;
    public static Block wallDarkGrayStone;
    public static Block wallBlackStone;
    public static Block wallBlueStone;
    public static Block wallBriqueGresDore;
    public static Block wallGresCiselleDore;
    public static Block wallBriqueNoireMoussueAngmar2;
    public static Block wallBriqueNoireAngmar2;
    public static Block wallBriqueNoireMoussueAngmar;
    public static Block wallBriqueNoireCraqueleeAngmar;
    public static Block wallBriqueNoireAngmar;
    public static Block wallPlanksAcacia;
    public static Block wallPlanksBigOak;
    public static Block wallPlanksBirch;
    public static Block wallPlanksJungle;
    public static Block wallPlanksOak;
    public static Block wallPlanksSpruce;
    public static Block wallNewPlanksAcacia;
    public static Block wallNewPlanksBigOak;
    public static Block wallNewPlanksBirch;
    public static Block wallNewPlanksJungle;
    public static Block wallNewPlanksOak;
    public static Block wallNewPlanksSpruce;
    public static Block wallPlanksAcaciaPolished;
    public static Block wallPlanksBigOakPolished;
    public static Block wallPlanksBirchPolished;
    public static Block wallPlanksJunglePolished;
    public static Block wallPlanksOakPolished;
    public static Block wallPlanksSprucePolished;
    public static Block verticalSlabBriqueGresTaille;
    public static Block verticalSlabGresTaille;
    public static Block verticalSlabGrosseBriqueGresTaille;
    public static Block veticalSlabBriqueGresSculpte;
    public static Block verticalSlabGresCiselle;
    public static Block verticalSlabBriqueGresSculpte;
    public static Block verticalSlabPierreTailleeVerte;
    public static Block verticalSlabPierreTailleeBleue;
    public static Block verticalSlabPierreTailleeGrise;
    public static Block verticalSlabPierreTailleeFoncee;
    public static Block verticalSlabPierreTailleeBlanche;
    public static Block verticalSlabPierreTailleeFonceeCisellee;
    public static Block verticalSlabPierreTailleeGriseCisellee;
    public static Block verticalSlabPierreTailleeBlancheCisellee;
    public static Block verticalSlabPierreTailleeDale;
    public static Block verticalSlabPave;
    public static Block verticalSlabPierreTailleeSombre;
    public static Block verticalSlabCobblestoneDale;
    public static Block verticalSlabDarkStoneTaille;
    public static Block verticalSlabBriqueRocheGriseTaillee;
    public static Block verticalSlabBriqueGresFonce;
    public static Block verticalSlabBrownBrick;
    public static Block verticalSlabPaveCarnDum;
    public static Block verticalSlabDaleStone;
    public static Block verticalSlabWhiteStone;
    public static Block verticalSlabGrayStone;
    public static Block verticalSlabDarkGrayStone;
    public static Block verticalSlabBlackStone;
    public static Block verticalSlabBlueStone;
    public static Block verticalSlabBriqueGresDore;
    public static Block verticalSlabGresCiselleDore;
    public static Block verticalSlabBriqueNoireMoussueAngmar2;
    public static Block verticalSlabBriqueNoireAngmar2;
    public static Block verticalSlabBriqueNoireMoussueAngmar;
    public static Block verticalSlabBriqueNoireCraqueleeAngmar;
    public static Block verticalSlabBriqueNoireAngmar;
    public static Block verticalSlabPlanksAcacia;
    public static Block verticalSlabPlanksBigOak;
    public static Block verticalSlabPlanksBirch;
    public static Block verticalSlabPlanksJungle;
    public static Block verticalSlabPlanksOak;
    public static Block verticalSlabPlanksSpruce;
    public static Block verticalSlabNewPlanksAcacia;
    public static Block verticalSlabNewPlanksBigOak;
    public static Block verticalSlabNewPlanksBirch;
    public static Block verticalSlabNewPlanksJungle;
    public static Block verticalSlabNewPlanksOak;
    public static Block verticalSlabNewPlanksSpruce;
    public static Block verticalSlabPlanksAcaciaPolished;
    public static Block verticalSlabPlanksBigOakPolished;
    public static Block verticalSlabPlanksBirchPolished;
    public static Block verticalSlabPlanksJunglePolished;
    public static Block verticalSlabPlanksOakPolished;
    public static Block verticalSlabPlanksSprucePolished;
    public static Block verticalSlabStone;
    public static Block verticalSlabDirt;
    public static Block verticalSlabCobblestone;
    public static Block verticalSlabGravel;
    public static Block verticalSlabBrick;
    public static Block verticalSlabCoal;
    public static Block verticalSlabStonebrick;
    public static Block verticalSlabMossyStonebrick;
    public static Block verticalSlabStonebrickCracked;
    public static Block verticalSlabStonebrickChiselled;
    public static Block verticalSlabQuartz;
    public static Block verticalSlabQuartzChiselled;
    public static Block verticalSlabDarkGravel;
    public static Block verticalSlabLightGravel;
    public static Block verticalSlabDirtGravel;
    public static Block verticalSlabDarkDirtGravel;
    public static Block verticalSlabSable;
    public static Block greyHaze;
    public static Block blackHaze;
    public static Block haradFurnaceOn;
    public static Block haradFurnaceOff;
    public static Block urukCraftingTable;
    public static Block ironbrick;
    public static Block stairIronbrick;
    public static Block slabIronbrick;
    public static Block doubleSlabIronbrick;
    public static Block wallIronbrick;
    public static Block verticalSlabIronbrick;
    public static Block slate;
    public static Block stairSlate;
    public static Block slabSlate;
    public static Block doubleSlabSlate;
    public static Block verticalSlabSlate;
    public static Block darkSlate;
    public static Block stairDarkSlate;
    public static Block slabDarkSlate;
    public static Block doubleSlabDarkSlate;
    public static Block verticalSlabDarkSlate;
    public static Block blackSlate;
    public static Block stairBlackSlate;
    public static Block slabBlackSlate;
    public static Block doubleSlabBlackSlate;
    public static Block verticalSlabBlackSlate;
    public static Block tile;
    public static Block stairTile;
    public static Block slabTile;
    public static Block doubleSlabTile;
    public static Block verticalSlabTile;
    public static Block slateEsgaroth;
    public static Block stairSlateEsgaroth;
    public static Block slabSlateEsgaroth;
    public static Block doubleSlabSlateEsgaroth;
    public static Block verticalSlabSlateEsgaroth;
    public static Block stairWhiteColombage;
    public static Block slabWhiteColombage;
    public static Block doubleSlabWhiteColombage;
    public static Block verticalSlabWhiteColombage;
    public static Block stonebrickWhiteMossy;
    public static Block stairStonebrickWhiteMossy;
    public static Block slabPierreTailleeBlancheMoussue;
    public static Block doubleSlabPierreTailleeBlancheMoussue;
    public static Block wallPierreTailleeBlancheMoussue;
    public static Block verticalSlabPierreTailleeBlancheMoussue;
    public static Block stonebrickDarkMossy;
    public static Block stairStonebrickDarkMossy;
    public static Block slabPierreTailleeFonceeMoussue;
    public static Block doubleSlabPierreTailleeFonceeMoussue;
    public static Block wallPierreTailleeFonceeMoussue;
    public static Block verticalSlabPierreTailleeFonceeMoussue;
    public static Block stonebrickGreyMossy;
    public static Block stairStonebrickGreyMossy;
    public static Block slabPierreTailleeGriseMoussue;
    public static Block doubleSlabPierreTailleeGriseMoussue;
    public static Block wallPierreTailleeGriseMoussue;
    public static Block verticalSlabPierreTailleeGriseMoussue;
    public static Block stonebrickDarkBisCracked;
    public static Block stairStonebrickDarkBisCracked;
    public static Block slabDarkBisCracked;
    public static Block doubleSlabDarkBisCracked;
    public static Block wallDarkBisCracked;
    public static Block verticalSlabDarkBisCracked;
    public static Block totemSafe;
    public static Block totem_1;
    public static Block totem_2;
    public static Block totem_3;
    public static Block totemTaken;
    public static Block sandPile;
    public static Item itemSandPile;
    public static Block facebook;
    public static Block youtube;
    public static Block forum;
    public static Block doubleDriedGrass;
    public static Block driedVine;
    public static Block tripleDriedGrass;
    public static Block bigShrubNorthSnow;
    public static Block lavande;
    public static Block iris;
    public static Block calla;
    public static Block branchSpruce;
    public static Block branchBirch;
    public static Block branchJungle;
    public static Block branchAcacia;
    public static Block branchOak;
    public static Block branchBigOak;
    public static Block branchAsh;
    public static Block branchEucalyptus;
    public static Block branchPalm;
    public static Block branchLiquidambar;
    public static Block branchSaule;
    public static Block branchChataignier;
    public static Block branchMallorn;
    public static Block blasonServer;
    public static Block bannerIsengard;
    public static Block bannerGundabad;
    public static Block bannerUmbar;
    public static Block bannerErebor;
    public static Block branchcobbleStoneDarknew;
    public static Block branchstoneBrickDarkNew;
    public static Block etendardAngmarHaut;
    public static Block etendardAngmarMilieu;
    public static Block etendardAngmarBas;
    public static Block etendardAngmarFin;
    public static Block etendardAngmarVide;
    public static Block etendardAngmarMilieuVide;
    public static Block etendardIsengardHaut;
    public static Block etendardIsengardMilieu;
    public static Block etendardIsengardBas;
    public static Block etendardIsengardFin;
    public static Block etendardIsengardVide;
    public static Block etendardEreborFin;
    public static Block etendardMordorHaut;
    public static Block etendardMordorMilieu;
    public static Block etendardMordorBas;
    public static Block etendardMordorFin;
    public static Block etendardMordorVide;
    public static Block etendardHaradHaut;
    public static Block etendardHaradMilieu;
    public static Block etendardHaradBas;
    public static Block etendardUmbarHaut;
    public static Block etendardUmbarBas;
    public static Block etendardUmbarFin;
    public static Block etendardUmbarVide;
    public static Block etendardUmbarFirst;
    public static Block etendardUmbarSecond;
    public static Block etendardDunHaut;
    public static Block etendardDunVide;
    public static Block etendardDunBas;
    public static Block etendardDunFin;
    public static Block etendardRhunHaut;
    public static Block etendardRhunVide;
    public static Block etendardRhunBas;
    public static Block etendardRhunFin;
    public static Block etendardRohanHaut;
    public static Block etendardRohanVide;
    public static Block etendardRohanBas;
    public static Block etendardRohanFin;
    public static Block etendardGondorHaut;
    public static Block etendardGondorMilieu;
    public static Block etendardGondorBas;
    public static Block etendardGondorFin;
    public static Block carpentryFirst;
    public static Block carpentrySecond;
    public static Block masonryFirst;
    public static Block masonryBis;
    public static Block masonryTer;
    public static Block lanceHaut;
    public static Block lanceHaut1;
    public static Block lanceHaut2;
    public static Block lanceHaut3;
    public static Block lanceHaut4;
    public static Block lanceBas;
    public static Block bloodStain;
    public static Block torchAngmar;
    public static Block torchDwarf;
    public static Block torchDark;
    public static Block leavesyellowfancy;
    public static Block leavesorangefancy;
    public static Block leavesredfancy;
    public static Block leavesbrownfancy;
    public static Item lembas;
    public static Item rum;
    public static Item whine;
    public static Item mobBalrogSword;
    public static Item legendaryEvilSword;
    public static Item legendaryDragonSword;
    public static Item legendaryHumanSword;
    public static Item angmarSpearUngraded;
    public static Item angmarSwordGraded;
    public static Item angmarSwordBoss;
    public static Item angmarSpearBoss;
    public static Item angmarAxeGraded;
    public static Item angmarBec;
    public static Item angmarSwordGradedBis;
    public static Item dunAxe;
    public static Item dunAxeBis;
    public static Item dunAxeBoss;
    public static Item ereborSwordGraded;
    public static Item ereborSwordGradedBis;
    public static Item ereborDague;
    public static Item gondorDague;
    public static Item gondorSword;
    public static Item ironHillsAxeGraded;
    public static Item isengardAxeBoss;
    public static Item isengardAxeBossHand;
    public static Item isengardAxeGraded;
    public static Item isengardCrossbowGradedLoaded;
    public static Item isengardCrossbowGradedUnloaded;
    public static Item isengardSwordIron;
    public static Item isengardSwordIronUsed;
    public static Item isengardSwordAlloy;
    public static Item isengardSwordAlloyUsed;
    public static Item isengardBowBoss;
    public static Item isengardSwordBoss;
    public static Item isengardTorch;
    public static Item khazadDumAxe;
    public static Item khazadDumAxeDouble;
    public static Item lorienSwordGraded;
    public static Item lorienSwordUngraded;
    public static Item lorienSwordUngradedBis;
    public static Item lorienDague;
    public static Item mirkwoodSwordBoss;
    public static Item mordorAxeGraded;
    public static Item mordorAxeUngraded;
    public static Item mordorSwordGraded;
    public static Item mordorSpearUngraded;
    public static Item mordorSwordBoss;
    public static Item nordinbadAxeBoss;
    public static Item rohanAxe;
    public static Item umbarSwordGraded;
    public static Item umbarSwordUngraded;
    public static Item umbarSwordUngradedBis;
    public static Item umbarSwordUngradedTer;
    public static Item umbarDague;
    public static Item gondorBow;
    public static Item elfeBow;
    public static Item biere;
    public static Item biere2;
    public static Item dard;
    public static Item casque;
    public static Item jambiere;
    public static Item botte;
    public static Item plastron;
    public static Item hache;
    public static Item casque2;
    public static Item jambiere2;
    public static Item botte2;
    public static Item plastron2;
    public static Item jambiere3;
    public static Item plastron3;
    public static Item casque3;
    public static Item botte3;
    public static Item scimitar;
    public static Item morningstar;
    public static Item iron_sword;
    public static Item iron_axe;
    public static Item hammer;
    public static Item falchion;
    public static Item sword_orc_gundabad;
    public static Item sword_morgul;
    public static Item sword_angmar;
    public static Item soldat_angmar;
    public static Item generaux_angmar;
    public static Item axe_gundabad;
    public static Item sword_elfe;
    public static Item narya;
    public static Item nenya;
    public static Item ring;
    public static Slab slabGresTaille;
    public static Slab doubleSlabGresTaille;
    public static Slab slabBriqueGresTaille;
    public static Slab doubleSlabBriqueGresTaille;
    public static Slab slabGres;
    public static Slab doubleSlabGres;
    public static Slab slabBriqueNoireAngmar;
    public static Slab doubleSlabBriqueNoireAngmar;
    public static Slab slabBriqueNoireCraqueleeAngmar;
    public static Slab doubleSlabBriqueNoireCraqueleeAngmar;
    public static Slab slabBriqueNoireMoussueAngmar;
    public static Slab doubleSlabBriqueNoireMoussueAngmar;
    public static Slab slabCobblestoneDale;
    public static Slab doubleSlabCobblestoneDale;
    public static Slab slabGresCiselle;
    public static Slab doubleSlabGresCiselle;
    public static Slab slabBriqueGresSculpte;
    public static Slab doubleSlabBriqueGresSculpte;
    public static Slab slabGrosseBriqueGresTaille;
    public static Slab doubleSlabGrosseBriqueGresTaille;
    public static Slab slabBriqueNoireAngmar2;
    public static Slab doubleSlabBriqueNoireAngmar2;
    public static Slab slabBriqueNoireMoussueAngmar2;
    public static Slab doubleSlabBriqueNoireMoussueAngmar2;
    public static Slab slabDarkStoneTaille;
    public static Slab doubleSlabDarkStoneTaille;
    public static Slab slabGresCiselleDore;
    public static Slab doubleSlabGresCiselleDore;
    public static Slab slabBriqueGresDore;
    public static Slab doubleSlabBriqueGresDore;
    public static Slab slabBlueStone;
    public static Slab doubleSlabBlueStone;
    public static Slab slabBlackStone;
    public static Slab doubleSlabBlackStone;
    public static Slab slabDarkGrayStone;
    public static Slab doubleSlabDarkGrayStone;
    public static Slab slabGrayStone;
    public static Slab doubleSlabGrayStone;
    public static Slab slabWhiteStone;
    public static Slab doubleSlabWhiteStone;
    public static Slab slabDaleStone;
    public static Slab doubleSlabDaleStone;
    public static Slab slabPaveCarnDum;
    public static Slab doubleSlabPaveCarnDum;
    public static Slab slabBrownBrick;
    public static Slab doubleSlabBrownBrick;
    public static Slab slabBriqueGresFonce;
    public static Slab doubleSlabBriqueGresFonce;
    public static Slab slabBriqueRocheGriseTaillee;
    public static Slab doubleSlabBriqueRocheGriseTaillee;
    public static Slab slabPierreTailleeSombre;
    public static Slab doubleSlabPierreTailleeSombre;
    public static Slab slabPave;
    public static Slab doubleSlabPave;
    public static Slab slabPierreTailleeDale;
    public static Slab doubleSlabPierreTailleeDale;
    public static Slab slabPierreTailleeBlancheCisellee;
    public static Slab doubleSlabPierreTailleeBlancheCisellee;
    public static Slab slabPierreTailleeGriseCisellee;
    public static Slab doubleSlabPierreTailleeGriseCisellee;
    public static Slab slabPierreTailleeFonceeCisellee;
    public static Slab doubleSlabPierreTailleeFonceeCisellee;
    public static Slab slabPierreTailleeBlanche;
    public static Slab doubleSlabPierreTailleeBlanche;
    public static Slab slabPierreTailleeFoncee;
    public static Slab doubleSlabPierreTailleeFoncee;
    public static Slab slabPierreTailleeGrise;
    public static Slab doubleSlabPierreTailleeGrise;
    public static Slab slabPierreTailleeBleue;
    public static Slab doubleSlabPierreTailleeBleue;
    public static Slab slabPierreTailleeVerte;
    public static Slab doubleSlabPierreTailleeVerte;
    public static Slab slabDarkGravel;
    public static Slab doubleSlabDarkGravel;
    public static Slab slabLightGravel;
    public static Slab doubleSlabLightGravel;
    public static Slab slabDirtGravel;
    public static Slab doubleSlabDirtGravel;
    public static Slab slabDarkDirtGravel;
    public static Slab doubleSlabDarkDirtGravel;
    public static Slab slabSable;
    public static Slab doubleSlabSable;
    public static Grass brownGrassShort;
    public static Grass brownGrassTall;
    public static Grass deadGrassShort;
    public static Grass deadGrassTall;
    public static Grass deadGrassYellow;
    public static ItemArmor.ArmorMaterial armor;
    public static Item.ToolMaterial toolTuto;
    public static CreativeTabs grassTab;
    public static CreativeTabs rocheTab;
    public static CreativeTabs stairsTab;
    public static CreativeTabs slabTab;
    public static CreativeTabs verticalSlabTab;
    public static CreativeTabs wallTab;
    public static CreativeTabs decorationTab;
    public static CreativeTabs etendardTab;
    public static CreativeTabs naturalTab;
    public static CreativeTabs vitreTab;
    public static CreativeTabs colombageTab;
    public static CreativeTabs itemTab;
    public static CreativeTabs weaponTab;
    public static CreativeTabs mineraiTab;
    public static CreativeTabs foodTab;
    public static CreativeTabs branchTab;
    public static CreativeTabs block3DTab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
       
    	//FLUIDES
    	
    	blood = new NewFluid("sang", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)blood);
        blockBlood = new BlockFluid(blood, Material.water, "sang", "modsda:blood");
        GameRegistry.registerBlock((Block)blockBlood, (String)"fluidTutorial");
        bucketBlood = new Bucket("bucketBlood", "modsda:bucket_blood", blockBlood);
        GameRegistry.registerItem((Item)bucketBlood, (String)"bucketBlood");
        
        waterNotFreezing = new NewFluid("waterNotFreezing", 4000, 1000);
        FluidRegistry.registerFluid((Fluid)waterNotFreezing);
        blockWaterNotFreezing = new BlockFluid(waterNotFreezing, Material.water, "waterNotFreezing", "water");
        GameRegistry.registerBlock((Block)blockWaterNotFreezing, (String)"waterNotFreezing");
        bucketWaterNotFreezing = new Bucket("bucketWaterNotFreezing", "bucket_water", blockWaterNotFreezing);
        GameRegistry.registerItem((Item)bucketWaterNotFreezing, (String)"bucketWaterNotFreezing");
        
        ironFluid = new NewFluid("ironFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)ironFluid);
        blockIronFluid = new BlockFluid(ironFluid, Material.lava, "blockIronFluid", "modsda:ironfluid");
        GameRegistry.registerBlock((Block)blockIronFluid, (String)"blockIronFluid");
        bucketIronFluid = new Bucket("bucketIron", "modsda:bucket_iron", blockIronFluid);
        GameRegistry.registerItem((Item)bucketIronFluid, (String)"bucketIronFluid");
        
        mithrilFluid = new NewFluid("mithrilFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)mithrilFluid);
        blockMithrilFluid = new BlockFluid(mithrilFluid, Material.lava, "blockMithrilFluid", "modsda:mithrilfluid");
        GameRegistry.registerBlock((Block)blockMithrilFluid, (String)"blockMithrilFluid");
        bucketMithrilFluid = new Bucket("bucketMithril", "modsda:bucket_mithril", blockMithrilFluid);
        GameRegistry.registerItem((Item)bucketMithrilFluid, (String)"bucketMithrilFluid");
        
        silverFluid = new NewFluid("silverFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)silverFluid);
        blockSilverFluid = new BlockFluid(silverFluid, Material.lava, "blockSilverFluid", "modsda:silverfluid");
        GameRegistry.registerBlock((Block)blockSilverFluid, (String)"blockSilverFluid");
        bucketSilverFluid = new Bucket("bucketSilver", "modsda:bucket_iron", blockSilverFluid);
        GameRegistry.registerItem((Item)bucketSilverFluid, (String)"bucketSilverFluid");
        
        goldFluid = new NewFluid("goldFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)goldFluid);
        blockGoldFluid = new BlockFluid(goldFluid, Material.lava, "blockGoldFluid", "modsda:goldfluid");
        GameRegistry.registerBlock((Block)blockGoldFluid, (String)"blockGoldFluid");
        bucketGoldFluid = new Bucket("bucketGold", "modsda:bucket_gold", blockGoldFluid);
        GameRegistry.registerItem((Item)bucketGoldFluid, (String)"bucketGoldFluid");
        
        rubisFluid = new NewFluid("rubisFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)rubisFluid);
        blockRubisFluid = new BlockFluid(rubisFluid, Material.lava, "blockRubisFluid", "modsda:rubisfluid");
        GameRegistry.registerBlock((Block)blockRubisFluid, (String)"blockRubisFluid");
        bucketRubisFluid = new Bucket("bucketRubis", "modsda:bucket_rubis", blockRubisFluid);
        GameRegistry.registerItem((Item)bucketRubisFluid, (String)"bucketRubisFluid");
        
        saphirFluid = new NewFluid("saphirFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)saphirFluid);
        blockSaphirFluid = new BlockFluid(saphirFluid, Material.lava, "blockSaphirFluid", "modsda:saphirfluid");
        GameRegistry.registerBlock((Block)blockSaphirFluid, (String)"blockSaphirFluid");
        bucketSaphirFluid = new Bucket("bucketSaphir", "modsda:bucket_saphir", blockSaphirFluid);
        GameRegistry.registerItem((Item)bucketSaphirFluid, (String)"bucketSaphirFluid");
        
        diamantFluid = new NewFluid("diamantFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)diamantFluid);
        blockDiamantFluid = new BlockFluid(diamantFluid, Material.lava, "blockDiamantFluid", "modsda:diamantfluid");
        GameRegistry.registerBlock((Block)blockDiamantFluid, (String)"blockDiamantFluid");
        bucketDiamantFluid = new Bucket("bucketDiamant", "modsda:bucket_diamant", blockDiamantFluid);
        GameRegistry.registerItem((Item)bucketDiamantFluid, (String)"bucketDiamantFluid");
        
        coalFluid = new NewFluid("coalFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)coalFluid);
        blockCoalFluid = new BlockFluid(coalFluid, Material.lava, "blockCoalFluid", "modsda:coalfluid");
        GameRegistry.registerBlock((Block)blockCoalFluid, (String)"blockCoalFluid");
        bucketCoalFluid = new Bucket("bucketCoal", "modsda:bucket_coal", blockCoalFluid);
        GameRegistry.registerItem((Item)bucketCoalFluid, (String)"bucketCoalFluid");
        
        emeraudFluid = new NewFluid("emeraudFluid", 4000, 2500);
        FluidRegistry.registerFluid((Fluid)emeraudFluid);
        blockEmeraudFluid = new BlockFluid(emeraudFluid, Material.lava, "blockEmeraudFluid", "modsda:emeraudfluid");
        GameRegistry.registerBlock((Block)blockEmeraudFluid, (String)"blockEmeraudFluid");
        bucketEmeraudFluid = new Bucket("bucketEmeraud", "modsda:bucket_emeraud", blockEmeraudFluid);
        GameRegistry.registerItem((Item)bucketEmeraudFluid, (String)"bucketEmeraudFluid");

        
       
        
      
        //BLOCS DECORATION
       
        diamond_blockNew = new Rock("diamond_blockNew", "modsda:diamond_block");
        GameRegistry.registerBlock((Block)diamond_blockNew, (String)"diamond_blockNew");
        
        emerald_blockNew = new Rock("emerald_blockNew", "modsda:emerald_block");
        GameRegistry.registerBlock((Block)emerald_blockNew, (String)"emerald_blockNew");
        
        gold_blockNew = new Rock("gold_blockNew", "modsda:gold_block");
        GameRegistry.registerBlock((Block)gold_blockNew, (String)"gold_blockNew");
        
        iron_blockNew = new Rock("iron_blockNew", "modsda:iron_block");
        GameRegistry.registerBlock((Block)iron_blockNew, (String)"iron_blockNew");
        
        lapis_blockNew = new Rock("lapis_blockNew", "modsda:lapis_block");
        GameRegistry.registerBlock((Block)lapis_blockNew, (String)"lapis_blockNew");
        
        b_stonebrickgrey_blood = new Rock("b_stonebrickgrey_blood", "modsda:b_stonebrickgrey_blood");
        GameRegistry.registerBlock((Block)b_stonebrickgrey_blood, (String)"b_stonebrickgrey_blood");
       
        b_stonebrickwhite_blood = new Rock("b_stonebrickwhite_blood", "modsda:b_stonebrickwhite_blood");
        GameRegistry.registerBlock((Block)b_stonebrickwhite_blood, (String)"b_stonebrickwhite_blood");
        
        b_stonebrickdark_blood = new Rock("b_stonebrickdark_blood", "modsda:b_stonebrickdark_blood");
        GameRegistry.registerBlock((Block)b_stonebrickdark_blood, (String)"b_stonebrickdark_blood");
       
        b_pave2Blood = new Rock("b_pave2Blood", "modsda:b_pave2Blood");
        GameRegistry.registerBlock((Block)b_pave2Blood, (String)"b_pave2Blood");
       
        b_paveBlood = new Rock("b_paveBlood", "modsda:b_paveBlood");
        GameRegistry.registerBlock((Block)b_paveBlood, (String)"b_paveBlood");
       
        b_stonebrickdark2Blood = new Rock("b_stonebrickdark2Blood", "modsda:b_stonebrickdark2Blood");
        GameRegistry.registerBlock((Block)b_stonebrickdark2Blood, (String)"b_stonebrickdark2Blood");
       
        orange_sandstone_normalBlood = new Rock("orange_sandstone_normalBlood", "modsda:orange_sandstone_normalBlood");
        GameRegistry.registerBlock((Block)orange_sandstone_normalBlood, (String)"orange_sandstone_normalBlood");
       
        pavesandBlood = new Rock("pavesandBlood", "modsda:pavesandBlood");
        GameRegistry.registerBlock((Block)pavesandBlood, (String)"pavesandBlood");
        
        sandbrick2Blood = new Rock("sandbrick2Blood", "modsda:sandbrick2Blood");
        GameRegistry.registerBlock((Block)sandbrick2Blood, (String)"sandbrick2Blood");
       
        sandbrick3Blood = new Rock("sandbrick3Blood", "modsda:sandbrick3Blood");
        GameRegistry.registerBlock((Block)sandbrick3Blood, (String)"sandbrick3Blood");
       
        sandbrickBlood = new Rock("sandbrickBlood", "modsda:sandbrickBlood");
        GameRegistry.registerBlock((Block)sandbrickBlood, (String)"sandbrickBlood");
       
        stoneBrickBis2Blood = new Rock("stoneBrickBis2Blood", "modsda:stoneBrickBis2Blood");
        GameRegistry.registerBlock((Block)stoneBrickBis2Blood, (String)"stoneBrickBis2Blood");
       
        stonebrickbisBlood = new Rock("stonebrickbisBlood", "modsda:stonebrickbisBlood");
        GameRegistry.registerBlock((Block)stonebrickbisBlood, (String)"stonebrickbisBlood");
       
        stoneBrickCrackedBlood = new Rock("stoneBrickCrackedBlood", "modsda:stoneBrickCrackedBlood");
        GameRegistry.registerBlock((Block)stoneBrickCrackedBlood, (String)"stoneBrickCrackedBlood");
        
        stoneBrickSmoothBlood = new Rock("stoneBrickSmoothBlood", "modsda:stoneBrickSmoothBlood");
        GameRegistry.registerBlock((Block)stoneBrickSmoothBlood, (String)"stoneBrickSmoothBlood");
      
        pilierBas = new Rock("pilierBas", "modsda:pilierBas");
        GameRegistry.registerBlock((Block)pilierBas, (String)"pilierBas");
       
        pilierMilieu = new Rock("pilierMilieu", "modsda:pilierMilieu");
        GameRegistry.registerBlock((Block)pilierMilieu, (String)"pilierMilieu");
       
        pilierHaut = new Rock("pilierHaut", "modsda:pilierHaut");
        GameRegistry.registerBlock((Block)pilierHaut, (String)"pilierHaut");
       
        pilierBasGres = new Rock("pilierBasGres", "modsda:pilierBasGres");
        GameRegistry.registerBlock((Block)pilierBasGres, (String)"pilierBasGres");
        
        pilierMilieuGres = new Rock("pilierMilieuGres", "modsda:pilierMilieuGres");
        GameRegistry.registerBlock((Block)pilierMilieuGres, (String)"pilierMilieuGres");
       
        pilierHautGres = new Rock("pilierHautGres", "modsda:pilierHautGres");
        GameRegistry.registerBlock((Block)pilierHautGres, (String)"pilierHautGres");
       
        blockBird = new Rock("blockBird", "modsda:blockBird");
        GameRegistry.registerBlock((Block)blockBird, (String)"blockBird");
       
        blockBird2 = new Rock("blockBird2", "modsda:blockBird2");
        GameRegistry.registerBlock((Block)blockBird2, (String)"blockBird2");
       
        blockDragon = new Rock("blockDragon", "modsda:blockDragon");
        GameRegistry.registerBlock((Block)blockDragon, (String)"blockDragon");
       
        blockDragon2 = new Rock("blockDragon2", "modsda:blockDragon2");
        GameRegistry.registerBlock((Block)blockDragon2, (String)"blockDragon2");
       
        blockHorse = new Rock("blockHorse", "modsda:blockHorse");
        GameRegistry.registerBlock((Block)blockHorse, (String)"blockHorse");
       
        blockWolf = new Rock("blockWolf", "modsda:blockWolf");
        GameRegistry.registerBlock((Block)blockWolf, (String)"blockWolf");
      
        stoneTree = new Rock("stoneTree", "modsda:stoneTree");
        GameRegistry.registerBlock((Block)stoneTree, (String)"stoneTree");
        
        rockMorgul = new RockLighted("rockMorgul", "modsda:morgul_rock");
        GameRegistry.registerBlock((Block)rockMorgul, (String)"rockMorgul");
        
        barrelCoal = new BarrelSide("barrelCoal", "modsda:coalblock");
        GameRegistry.registerBlock((Block)barrelCoal, (String)"barrelCoal");
       
        barrelCoalBis = new BarrelSide("barrelCoalBis", "modsda:barrelCoalBis");
        GameRegistry.registerBlock((Block)barrelCoalBis, (String)"barrelCoalBis");
        
        barrelMushrooms = new Barrel("barrel", "modsda:barrel");
        GameRegistry.registerBlock((Block)barrelMushrooms, (String)"barrel");
        
        barrelFish = new Barrel("barrel1", "modsda:barrel1");
        GameRegistry.registerBlock((Block)barrelFish, (String)"barrel1");
       
        barrelCookies = new Barrel("barrel2", "modsda:barrel2");
        GameRegistry.registerBlock((Block)barrelCookies, (String)"barrel2");
        
        barrelEye = new Barrel("barrel3", "modsda:barrel3");
        GameRegistry.registerBlock((Block)barrelEye, (String)"barrel3");
        
        barrelSalmon = new Barrel("barrel4", "modsda:barrel4");
        GameRegistry.registerBlock((Block)barrelSalmon, (String)"barrel4");
        
        barrelSalmonBis = new Barrel("barrel5", "modsda:barrel5");
        GameRegistry.registerBlock((Block)barrelSalmonBis, (String)"barrel5");
       
        barrelTools = new Barrel("barrel6", "modsda:barrel6");
        GameRegistry.registerBlock((Block)barrelTools, (String)"barrel6");
       
        barrelCardGame = new Barrel("barrel7", "modsda:barrel7");
        GameRegistry.registerBlock((Block)barrelCardGame, (String)"barrel7");
        
        barrelApple = new Barrel("barrel8", "modsda:barrel8");
        GameRegistry.registerBlock((Block)barrelApple, (String)"barrel8");
        
        barrelBasic = new Barrel("barrel9", "modsda:barrel9");
        GameRegistry.registerBlock((Block)barrelBasic, (String)"barrel9");
        
        barrelPaper = new Barrel("barrel10", "modsda:barrel10");
        GameRegistry.registerBlock((Block)barrelPaper, (String)"barrel10");
       
        echec = new Barrel("echec", "modsda:echec");
        GameRegistry.registerBlock((Block)echec, (String)"echec");
        
        benchCalligraphie = new Barrel("workbench", "modsda:workbench");
        GameRegistry.registerBlock((Block)benchCalligraphie, (String)"workbench");
        
        haradFurnaceOn = new Furnace(true, "haradFurnace", "modsda:HaradFurnace");
        GameRegistry.registerBlock((Block)haradFurnaceOn, (String)"haradFurnaceOn");
        haradFurnaceOff = new Furnace(false, "haradFurnace", "modsda:HaradFurnace");
        GameRegistry.registerBlock((Block)haradFurnaceOff, (String)"haradFurnaceOff");
        
        urukCraftingTable = new CraftingTable(Material.rock, "urukCraftingTable", "modsda:urukCraftingTable", true, 1, 0.625f);
        GameRegistry.registerBlock((Block)urukCraftingTable, (String)"urukCraftingTable");
        
        
        
        
        
        //FEUILLES
        
        leavesbrownfancy = new Leave("leavesbrownfancy", "modsda:LeavesBrown2");
        GameRegistry.registerBlock((Block)leavesbrownfancy, (String)"LeavesBrown2");
        
        leavesorangefancy = new Leave("leavesorangefancy", "modsda:LeavesOrange2");
        GameRegistry.registerBlock((Block)leavesorangefancy, (String)"leavesorangefancy");
        
        leavesredfancy = new Leave("leavesredfancy", "modsda:LeavesRed2");
        GameRegistry.registerBlock((Block)leavesredfancy, (String)"leavesredfancy");
        
        leavesyellowfancy = new Leave("leavesyellowfancy", "modsda:LeavesYellow2");
        GameRegistry.registerBlock((Block)leavesyellowfancy, (String)"leavesyellowfancy");
        
        skyrootLeaves = new Leave("skyrootLeaves", "modsda:SkyrootLeaves");
        GameRegistry.registerBlock((Block)skyrootLeaves, (String)"skyrootLeaves");
      
        leavesFloorPink = new LeavesFloor("leavesFloorPink", skyrootLeaves);
        GameRegistry.registerBlock((Block)leavesFloorPink, (String)"leavesFloorPink");
       
        goldenOakLeaves = new Leave("goldenOakLeaves", "modsda:GoldenOakLeaves");
        GameRegistry.registerBlock((Block)goldenOakLeaves, (String)"goldenOakLeaves");
       
        leavesFloorGolden = new LeavesFloor("leavesFloorGolden", goldenOakLeaves);
        GameRegistry.registerBlock((Block)leavesFloorGolden, (String)"leavesFloorGolden");
       
        leavesSpruce = new Leave("leavesSpruce", "modsda:leavesSpruce");
        GameRegistry.registerBlock((Block)leavesSpruce, (String)"leavesSpruce");
      
        leavesFloorGreen = new LeavesFloor("leavesFloorGreen", leavesSpruce);
        GameRegistry.registerBlock((Block)leavesFloorGreen, (String)"leavesFloorGreen");
       
        leavesMallorn = new LeaveOpaque("leavesMallorn", "modsda:leavesMallorn");
        GameRegistry.registerBlock((Block)leavesMallorn, (String)"leavesMallorn");
       
        leavesAutumnBrown = new LeaveOpaque("leavesAutumnBrown", "modsda:leavesBrown");
        GameRegistry.registerBlock((Block)leavesAutumnBrown, (String)"leavesAutumnBrown");
       
        leavesFloorAutumnBrown = new LeavesFloor("leavesFloorAutumnBrown", leavesAutumnBrown);
        GameRegistry.registerBlock((Block)leavesFloorAutumnBrown, (String)"leavesFloorAutumnBrown");
      
        leavesAutumnRed = new LeaveOpaque("leavesAutumnRed", "modsda:leavesRed");
        GameRegistry.registerBlock((Block)leavesAutumnRed, (String)"leavesAutumnRed");
       
        leavesFloorAutumnRed = new LeavesFloor("leavesFloorAutumnRed", leavesAutumnRed);
        GameRegistry.registerBlock((Block)leavesFloorAutumnRed, (String)"leavesFloorAutumnRed");
       
        leavesAutumnOrange = new LeaveOpaque("leavesAutumnOrange", "modsda:leavesOrange");
        GameRegistry.registerBlock((Block)leavesAutumnOrange, (String)"leavesAutumnOrange");
       
        leavesFloorAutumnOrange = new LeavesFloor("leavesFloorAutumnOrange", leavesAutumnOrange);
        GameRegistry.registerBlock((Block)leavesFloorAutumnOrange, (String)"leavesFloorAutumnOrange");
       
        leavesAutumnYellow = new LeaveOpaque("leavesAutumnYellow", "modsda:leavesYellow");
        GameRegistry.registerBlock((Block)leavesAutumnYellow, (String)"leavesAutumnYellow");
       
        leavesFloorAutumnYellow = new LeavesFloor("leavesFloorAutumnYellow", leavesAutumnYellow);
        GameRegistry.registerBlock((Block)leavesFloorAutumnYellow, (String)"leavesFloorAutumnYellow");
       
        leavesCypres = new LeaveOpaque("leavesCypres", "modsda:leavesCypres");
        GameRegistry.registerBlock((Block)leavesCypres, (String)"leavesCypres");
       
        leavesEucalyptus = new LeaveOpaque("leavesEucalyptus", "modsda:leavesEucalyptus");
        GameRegistry.registerBlock((Block)leavesEucalyptus, (String)"leavesEucalyptus");
        
        leavesFir = new LeaveOpaque("leavesFir", "modsda:leavesFir");
        GameRegistry.registerBlock((Block)leavesFir, (String)"leavesFir");
        
        leavesPalm = new LeaveOpaque("leavesPalm", "modsda:leavesPalm");
        GameRegistry.registerBlock((Block)leavesPalm, (String)"leavesPalm");
        
        leavesCoffeePlant = new LeaveOpaque("leavesCoffeePlant", "modsda:coffeeplant6");
        GameRegistry.registerBlock((Block)leavesCoffeePlant, (String)"leavesCoffeePlant");
       
        leavesGrapeFruit = new LeaveOpaque("leavesGrapeFruit", "modsda:leaves_grapefruit");
        GameRegistry.registerBlock((Block)leavesGrapeFruit, (String)"leavesGrapeFruit");
       
        leavesLemon = new LeaveOpaque("leavesLemon", "modsda:leaves_lemon");
        GameRegistry.registerBlock((Block)leavesLemon, (String)"leavesLemon");
       
        leavesOrange = new LeaveOpaque("leavesOrange", "modsda:leaves_orange");
        GameRegistry.registerBlock((Block)leavesOrange, (String)"leavesOrange");
      
        leavesSakura = new LeaveOpaque("leavesSakura", "modsda:leaves_sakura");
        GameRegistry.registerBlock((Block)leavesSakura, (String)"leavesSakura");
       
        leavesFloorSakura = new LeavesFloor("leavesFloorSakura", leavesSakura);
        GameRegistry.registerBlock((Block)leavesFloorSakura, (String)"leavesFloorSakura");
       
        leavesFloorBirch = new LeavesFloor("leavesFloorBirch", (Block)Blocks.leaves, 2);
        GameRegistry.registerBlock((Block)leavesFloorBirch, (String)"leavesFloorBirch");
       
        leavesFloorOak = new LeavesFloor("leavesFloorOak", (Block)Blocks.leaves, 0);
        GameRegistry.registerBlock((Block)leavesFloorOak, (String)"leavesFloorOak");
        
        leavesFloorJungle = new LeavesFloor("leavesFloorJungle", (Block)Blocks.leaves, 3);
        GameRegistry.registerBlock((Block)leavesFloorJungle, (String)"leavesFloorJungle");
        
        
        
        
        
        //BOIS
       
        branchSpruce = new Branch("branchSpruce", "log_spruce");
        GameRegistry.registerBlock((Block)branchSpruce, (String)"branchSpruce");
        
        branchBirch = new Branch("branchBirch", "log_birch");
        GameRegistry.registerBlock((Block)branchBirch, (String)"branchBirch");
        
        branchJungle = new Branch("branchJungle", "log_jungle");
        GameRegistry.registerBlock((Block)branchJungle, (String)"branchJungle");
        
        branchAcacia = new Branch("branchAcacia", "log_acacia");
        GameRegistry.registerBlock((Block)branchAcacia, (String)"branchAcacia");
        
        branchOak = new Branch("branchOak", "log_oak");
        GameRegistry.registerBlock((Block)branchOak, (String)"branchOak");
        
        branchBigOak = new Branch("branchBigOak", "log_big_oak");
        GameRegistry.registerBlock((Block)branchBigOak, (String)"branchBigOak");
        
        logAsh = new Log("logAsh", "modsda:logAsh");
        GameRegistry.registerBlock((Block)logAsh, (String)"logAsh");
      
        branchAsh = new Branch("branchAsh", "modsda:logAsh");
        GameRegistry.registerBlock((Block)branchAsh, (String)"branchAsh");
       
        logEucalyptus = new Log("logEucalyptus", "modsda:logEucalyptus");
        GameRegistry.registerBlock((Block)logEucalyptus, (String)"logEucalyptus");
       
        branchEucalyptus = new Branch("branchEucalyptus", "modsda:logEucalyptus");
        GameRegistry.registerBlock((Block)branchEucalyptus, (String)"branchEucalyptus");
       
        logPalm = new Log("logPalm", "modsda:logPalm");
        GameRegistry.registerBlock((Block)logPalm, (String)"logPalm");
        
        logLiquidambar = new Log("liquidambar", "modsda:log_liquidambar");
        GameRegistry.registerBlock((Block)logLiquidambar, (String)"logLiquidambar");
        branchLiquidambar = new Branch("branchLiquidambar", "modsda:log_liquidambar");
        GameRegistry.registerBlock((Block)branchLiquidambar, (String)"branchLiquidambar");
        planksLiquidambar = new Wood("planksLiquidambar", "modsda:planksLiquidambar");
        GameRegistry.registerBlock((Block)planksLiquidambar, (String)"planksLiquidambar");
        stairPlanksLiquidambar = new Stair(planksLiquidambar, "stairPlankLiquidambar");
        GameRegistry.registerBlock((Block)stairPlanksLiquidambar, (String)"stairPlankLiquidambar");
        slabPlanksLiquidambar = new Slab(planksLiquidambar, "slabPlankLiquidambar", false);
        doubleSlabPlanksLiquidambar = new Slab(planksLiquidambar, "doubleSlabPlankLiquidambar", true);
        GameRegistry.registerBlock((Block)slabPlanksLiquidambar, (String)"slabPlankLiquidambar");
        GameRegistry.registerBlock((Block)doubleSlabPlanksLiquidambar, (String)"doubleSlabPlankLiquidambar");
        wallPlanksLiquidambar = new Wall(planksLiquidambar, "wallPlanksLiquidambar");
        GameRegistry.registerBlock((Block)wallPlanksLiquidambar, (String)"wallPlanksLiquidambar");
        verticalSlabPlanksLiquidambar = new VerticalSlab(planksLiquidambar, "verticalSlabPlanksLiquidambar");
        GameRegistry.registerBlock((Block)verticalSlabPlanksLiquidambar, (String)"verticalSlabPlanksLiquidambar");
        
        logSaule = new Log("saule", "modsda:log_saule");
        GameRegistry.registerBlock((Block)logSaule, (String)"logSaule");
        branchSaule = new Branch("branchSaule", "modsda:log_saule");
        GameRegistry.registerBlock((Block)branchSaule, (String)"branchSaule");
        planksSaule = new Wood("planksSaule", "modsda:planksSaule");
        GameRegistry.registerBlock((Block)planksSaule, (String)"planksSaule");
        stairPlanksSaule = new Stair(planksSaule, "stairPlankSaule");
        GameRegistry.registerBlock((Block)stairPlanksSaule, (String)"stairPlankSaule");
        slabPlanksSaule = new Slab(planksSaule, "slabPlankSaule", false);
        doubleSlabPlanksSaule = new Slab(planksSaule, "doubleSlabPlankSaule", true);
        GameRegistry.registerBlock((Block)slabPlanksSaule, (String)"slabPlankSaule");
        GameRegistry.registerBlock((Block)doubleSlabPlanksSaule, (String)"doubleSlabPlankSaule");
        wallPlanksSaule = new Wall(planksSaule, "wallPlanksSaule");
        GameRegistry.registerBlock((Block)wallPlanksSaule, (String)"wallPlanksSaule");
        verticalSlabPlanksSaule = new VerticalSlab(planksSaule, "verticalSlabPlanksSaule");
        GameRegistry.registerBlock((Block)verticalSlabPlanksSaule, (String)"verticalSlabPlanksSaule");
        
        logChataignier = new Log("chataignier", "modsda:log_chataignier");
        GameRegistry.registerBlock((Block)logChataignier, (String)"logChataignier");
        branchChataignier = new Branch("branchChataignier", "modsda:log_chataignier");
        GameRegistry.registerBlock((Block)branchChataignier, (String)"branchChataignier");
        planksChataignier = new Wood("planksChataignier", "modsda:planksChataignier");
        GameRegistry.registerBlock((Block)planksChataignier, (String)"planksChataignier");
        stairPlanksChataignier = new Stair(planksChataignier, "stairPlankChataignier");
        GameRegistry.registerBlock((Block)stairPlanksChataignier, (String)"stairPlankChataignier");
        slabPlanksChataignier = new Slab(planksChataignier, "slabPlankChataignier", false);
        doubleSlabPlanksChataignier = new Slab(planksChataignier, "doubleSlabPlankChataignier", true);
        GameRegistry.registerBlock((Block)slabPlanksChataignier, (String)"slabPlankChataignier");
        GameRegistry.registerBlock((Block)doubleSlabPlanksChataignier, (String)"doubleSlabPlankChataignier");
        wallPlanksChataignier = new Wall(planksChataignier, "wallPlanksChataignier");
        GameRegistry.registerBlock((Block)wallPlanksChataignier, (String)"wallPlanksChataignier");
        verticalSlabPlanksChataignier = new VerticalSlab(planksChataignier, "verticalSlabPlanksChataignier");
        GameRegistry.registerBlock((Block)verticalSlabPlanksChataignier, (String)"verticalSlabPlanksChataignier");
       
        logMallorn = new Log("mallorn", "modsda:log_mallorn");
        GameRegistry.registerBlock((Block)logMallorn, (String)"logMallorn");
        branchMallorn = new Branch("branchMallorn", "modsda:log_mallorn");
        GameRegistry.registerBlock((Block)branchMallorn, (String)"branchMallorn");
        
        planksMallorn = new Wood("planksMallorn", "modsda:planksMallorn");
        GameRegistry.registerBlock((Block)planksMallorn, (String)"planksMallorn");
        stairPlanksMallorn = new Stair(planksMallorn, "stairPlankMallorn");
        GameRegistry.registerBlock((Block)stairPlanksMallorn, (String)"stairPlankMallorn");
        slabPlanksMallorn = new Slab(planksMallorn, "slabPlankMallorn", false);
        doubleSlabPlanksMallorn = new Slab(planksMallorn, "doubleSlabPlankMallorn", true);
        GameRegistry.registerBlock((Block)slabPlanksMallorn, (String)"slabPlankMallorn");
        GameRegistry.registerBlock((Block)doubleSlabPlanksMallorn, (String)"doubleSlabPlankMallorn");
        wallPlanksMallorn = new Wall(planksMallorn, "wallPlanksMallorn");
        GameRegistry.registerBlock((Block)wallPlanksMallorn, (String)"wallPlanksMallorn");
        verticalSlabPlanksMallorn = new VerticalSlab(planksMallorn, "verticalSlabPlanksMallorn");
        GameRegistry.registerBlock((Block)verticalSlabPlanksMallorn, (String)"verticalSlabPlanksMallorn");
        
        wallPlanksAcacia = new Wall(Blocks.planks, "wallPlanksAcacia", 4);
        GameRegistry.registerBlock((Block)wallPlanksAcacia, (String)"wallPlanksAcacia");
        verticalSlabPlanksAcacia = new VerticalSlab(Blocks.planks, "verticalSlabPlanksAcacia", 4);
        GameRegistry.registerBlock((Block)verticalSlabPlanksAcacia, (String)"verticalSlabPlanksAcacia");
        
        wallPlanksBigOak = new Wall(Blocks.planks, "wallPlanksBigOak", 5);
        GameRegistry.registerBlock((Block)wallPlanksBigOak, (String)"wallPlankBigOak");
        verticalSlabPlanksBigOak = new VerticalSlab(Blocks.planks, "verticalSlabPlanksBigOak", 5);
        GameRegistry.registerBlock((Block)verticalSlabPlanksBigOak, (String)"verticalSlabPlanksBigOak");
        
        wallPlanksBirch = new Wall(Blocks.planks, "wallPlanksBirch", 2);
        GameRegistry.registerBlock((Block)wallPlanksBirch, (String)"wallPlanksBirch");
        verticalSlabPlanksBirch = new VerticalSlab(Blocks.planks, "verticalSlabPlanksBirch", 2);
        GameRegistry.registerBlock((Block)verticalSlabPlanksBirch, (String)"verticalSlabPlanksBirch");
        
        wallPlanksJungle = new Wall(Blocks.planks, "wallPlanksJungle", 3);
        GameRegistry.registerBlock((Block)wallPlanksJungle, (String)"wallPlanksJungle");
        verticalSlabPlanksJungle = new VerticalSlab(Blocks.planks, "verticalSlabPlanksJungle", 3);
        GameRegistry.registerBlock((Block)verticalSlabPlanksJungle, (String)"verticalSlabPlanksJungle");
       
        wallPlanksOak = new Wall(Blocks.planks, "wallPlanksOak", 0);
        GameRegistry.registerBlock((Block)wallPlanksOak, (String)"wallPlanksOak");
        verticalSlabPlanksOak = new VerticalSlab(Blocks.planks, "verticalSlabPlanksOak", 0);
        GameRegistry.registerBlock((Block)verticalSlabPlanksOak, (String)"verticalSlabPlanksOak");
        
        wallPlanksSpruce = new Wall(Blocks.planks, "wallPlanksSpruce", 1);
        GameRegistry.registerBlock((Block)wallPlanksSpruce, (String)"wallPlanksSpruce");
        verticalSlabPlanksSpruce = new VerticalSlab(Blocks.planks, "verticalSlabPlanksSpruce", 1);
        GameRegistry.registerBlock((Block)verticalSlabPlanksSpruce, (String)"verticalSlabPlanksSpruce");
        
        plankNewAcacia = new Wood("plancheacacia", "modsda:b_plancheacacia");
        GameRegistry.registerBlock((Block)plankNewAcacia, (String)"plancheacacia");
        stairPlankNewAcacia = new Stair(plankNewAcacia, "stairPlankNewAcacia");
        GameRegistry.registerBlock((Block)stairPlankNewAcacia, (String)"stairPlankNewAcacia");
        slabPlankNewAcacia = new Slab(plankNewAcacia, "slabPlankNewAcacia", false);
        doubleSlabPlankNewAcacia = new Slab(plankNewAcacia, "doubleSlabPlankNewAcacia", true);
        GameRegistry.registerBlock((Block)slabPlankNewAcacia, (String)"slabPlankNewAcacia");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewAcacia, (String)"doubleSlabPlankNewAcacia");
        wallNewPlanksAcacia = new Wall(plankNewAcacia, "wallNewPlanksAcacia");
        GameRegistry.registerBlock((Block)wallNewPlanksAcacia, (String)"wallNewPlanksAcacia");
        verticalSlabNewPlanksAcacia = new VerticalSlab(plankNewAcacia, "verticalSlabNewPlanksAcacia");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksAcacia, (String)"verticalSlabNewPlanksAcacia");
        
        plankNewBigOak = new Wood("plancheoak", "modsda:b_plancheoak");
        GameRegistry.registerBlock((Block)plankNewBigOak, (String)"plancheoak");
        stairPlankNewBigOak = new Stair(plankNewBigOak, "stairPlankNewBigOak");
        GameRegistry.registerBlock((Block)stairPlankNewBigOak, (String)"stairPlankNewBigOak");
        slabPlankNewBigOak = new Slab(plankNewBigOak, "slabPlankNewBigOak", false);
        doubleSlabPlankNewBigOak = new Slab(plankNewBigOak, "doubleSlabPlankNewBigOak", true);
        GameRegistry.registerBlock((Block)slabPlankNewBigOak, (String)"slabPlankNewBigOak");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewBigOak, (String)"doubleSlabPlankNewBigOak");
        wallNewPlanksBigOak = new Wall(plankNewBigOak, "wallNewPlanksBigOak");
        GameRegistry.registerBlock((Block)wallNewPlanksBigOak, (String)"wallNewPlanksBigOak");
        verticalSlabNewPlanksBigOak = new VerticalSlab(plankNewBigOak, "verticalSlabNewPlanksBigOak");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksBigOak, (String)"verticalSlabNewPlanksBigOak");
        
        plankNewBirch = new Wood("planchebirch", "modsda:b_planchebirch");
        GameRegistry.registerBlock((Block)plankNewBirch, (String)"planchebirch");
        stairPlankNewBirch = new Stair(plankNewBirch, "stairPlankNewBirch");
        GameRegistry.registerBlock((Block)stairPlankNewBirch, (String)"stairPlankNewBirch");
        slabPlankNewBirch = new Slab(plankNewBirch, "slabPlankNewBirch", false);
        doubleSlabPlankNewBirch = new Slab(plankNewBirch, "doubleSlabPlankNewBirch", true);
        GameRegistry.registerBlock((Block)slabPlankNewBirch, (String)"slabPlankNewBirch");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewBirch, (String)"doubleSlabPlankNewBirch");
        wallNewPlanksBirch = new Wall(plankNewBirch, "wallNewPlanksBirch");
        GameRegistry.registerBlock((Block)wallNewPlanksBirch, (String)"wallNewPlanksBirch");
        verticalSlabNewPlanksBirch = new VerticalSlab(plankNewBirch, "verticalSlabNewPlanksBirch");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksBirch, (String)"verticalSlabNewPlanksBirch");
        
        plankNewJungle = new Wood("planchejungle", "modsda:b_planchejungle");
        GameRegistry.registerBlock((Block)plankNewJungle, (String)"planchejungle");
        stairPlankNewJungle = new Stair(plankNewJungle, "stairPlankNewJungle");
        GameRegistry.registerBlock((Block)stairPlankNewJungle, (String)"stairPlankNewJungle");
        slabPlankNewJungle = new Slab(plankNewJungle, "slabPlankNewJungle", false);
        doubleSlabPlankNewJungle = new Slab(plankNewJungle, "doubleSlabPlankNewJungle", true);
        GameRegistry.registerBlock((Block)slabPlankNewJungle, (String)"slabPlankNewJungle");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewJungle, (String)"doubleSlabPlankNewJungle");
        wallNewPlanksJungle = new Wall(plankNewJungle, "wallNewPlanksJungle");
        GameRegistry.registerBlock((Block)wallNewPlanksJungle, (String)"wallNewPlanksJungle");
        verticalSlabNewPlanksJungle = new VerticalSlab(plankNewJungle, "verticalSlabNewPlanksJungle");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksJungle, (String)"verticalSlabNewPlanksJungle");
        
        plankNewOak = new Wood("plancheoak2", "modsda:b_plancheoak2");
        GameRegistry.registerBlock((Block)plankNewOak, (String)"plancheoak2");
        stairPlankNewOak = new Stair(plankNewOak, "stairPlankNewOak");
        GameRegistry.registerBlock((Block)stairPlankNewOak, (String)"stairPlankNewOak");
        slabPlankNewOak = new Slab(plankNewOak, "slabPlankNewOak", false);
        doubleSlabPlankNewOak = new Slab(plankNewOak, "doubleSlabPlankNewOak", true);
        GameRegistry.registerBlock((Block)slabPlankNewOak, (String)"slabPlankNewOak");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewOak, (String)"doubleSlabPlankNewOak");
        wallNewPlanksOak = new Wall(plankNewOak, "wallNewPlanksOak");
        GameRegistry.registerBlock((Block)wallNewPlanksOak, (String)"wallNewPlanksOak");
        verticalSlabNewPlanksOak = new VerticalSlab(plankNewOak, "verticalSlabNewPlanksOak");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksOak, (String)"verticalSlabNewPlanksOak");
        
        plankNewSpruce = new Wood("planchespruce", "modsda:b_planchespruce");
        GameRegistry.registerBlock((Block)plankNewSpruce, (String)"planchespruce");
        stairPlankNewSpruce = new Stair(plankNewSpruce, "stairPlankNewSpruce");
        GameRegistry.registerBlock((Block)stairPlankNewSpruce, (String)"stairPlankNewSpruce");
        slabPlankNewSpruce = new Slab(plankNewSpruce, "slabPlankNewSpruce", false);
        doubleSlabPlankNewSpruce = new Slab(plankNewSpruce, "doubleSlabPlankNewSpruce", true);
        GameRegistry.registerBlock((Block)slabPlankNewSpruce, (String)"slabPlankNewSpruce");
        GameRegistry.registerBlock((Block)doubleSlabPlankNewSpruce, (String)"doubleSlabPlankNewSpruce");
        wallNewPlanksSpruce = new Wall(plankNewSpruce, "wallNewPlanksSpruce");
        GameRegistry.registerBlock((Block)wallNewPlanksSpruce, (String)"wallNewPlanksSpruce");
        verticalSlabNewPlanksSpruce = new VerticalSlab(plankNewSpruce, "verticalSlabNewPlanksSpruce");
        GameRegistry.registerBlock((Block)verticalSlabNewPlanksSpruce, (String)"verticalSlabNewPlanksSpruce");
        
        plankAcaciaPolished = new Wood("planksAcaciaPolished", "modsda:planks_acacia_polished");
        GameRegistry.registerBlock((Block)plankAcaciaPolished, (String)"planksAcaciaPolished");
        stairPlankAcaciaPolished = new Stair(plankAcaciaPolished, "stairPlankAcaciaPolished");
        GameRegistry.registerBlock((Block)stairPlankAcaciaPolished, (String)"stairPlankAcaciaPolished");
        slabPlankAcaciaPolished = new Slab(plankAcaciaPolished, "slabPlankAcaciaPolished", false);
        doubleSlabPlankAcaciaPolished = new Slab(plankAcaciaPolished, "doubleSlabPlankAcaciaPolished", true);
        GameRegistry.registerBlock((Block)slabPlankAcaciaPolished, (String)"slabPlankAcaciaPolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankAcaciaPolished, (String)"doubleSlabPlankAcaciaPolished");
        wallPlanksAcaciaPolished = new Wall(plankAcaciaPolished, "wallPlanksAcaciaPolished");
        GameRegistry.registerBlock((Block)wallPlanksAcaciaPolished, (String)"wallPlanksAcaciaPolished");
        verticalSlabPlanksAcaciaPolished = new VerticalSlab(plankAcaciaPolished, "verticalSlabPlanksAcaciaPolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksAcaciaPolished, (String)"verticalSlabPlanksAcaciaPolished");
        
        plankBigOakPolished = new Wood("planksBigOakPolished", "modsda:planks_big_oak_polished");
        GameRegistry.registerBlock((Block)plankBigOakPolished, (String)"planksBigOakPolished");
        stairPlankBigOakPolished = new Stair(plankBigOakPolished, "stairPlankBigOakPolished");
        GameRegistry.registerBlock((Block)stairPlankBigOakPolished, (String)"stairPlankBigOakPolished");
        slabPlankBigOakPolished = new Slab(plankBigOakPolished, "slabPlankBigOakPolished", false);
        doubleSlabPlankBigOakPolished = new Slab(plankBigOakPolished, "doubleSlabPlankBigOakPolished", true);
        GameRegistry.registerBlock((Block)slabPlankBigOakPolished, (String)"slabPlankBigOakPolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankBigOakPolished, (String)"doubleSlabPlankBigOakPolished");
        wallPlanksBigOakPolished = new Wall(plankBigOakPolished, "wallPlanksBigOakPolished");
        GameRegistry.registerBlock((Block)wallPlanksBigOakPolished, (String)"wallPlanksBigOakPolished");
        verticalSlabPlanksBigOakPolished = new VerticalSlab(plankBigOakPolished, "verticalSlabPlanksBigOakPolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksBigOakPolished, (String)"verticalSlabPlanksBigOakPolished");
        
        plankBirchPolished = new Wood("planksBirchPolished", "modsda:planks_birch_polished");
        GameRegistry.registerBlock((Block)plankBirchPolished, (String)"planksBirchPolished");
        stairPlankBirchPolished = new Stair(plankBirchPolished, "stairPlankBirchPolished");
        GameRegistry.registerBlock((Block)stairPlankBirchPolished, (String)"stairPlankBirchPolished");
        slabPlankBirchPolished = new Slab(plankBirchPolished, "slabPlankBirchPolished", false);
        doubleSlabPlankBirchPolished = new Slab(plankBirchPolished, "doubleSlabPlankBirchPolished", true);
        GameRegistry.registerBlock((Block)slabPlankBirchPolished, (String)"slabPlankBirchPolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankBirchPolished, (String)"doubleSlabPlankBirchPolished");
        wallPlanksBirchPolished = new Wall(plankBirchPolished, "wallPlanksBirchPolished");
        GameRegistry.registerBlock((Block)wallPlanksBirchPolished, (String)"wallPlanksBirchPolished");
        verticalSlabPlanksBirchPolished = new VerticalSlab(plankBirchPolished, "verticalSlabPlanksBirchPolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksBirchPolished, (String)"verticalSlabPlanksBirchPolished");
        
        plankJunglePolished = new Wood("planksJunglePolished", "modsda:planks_jungle_polished");
        GameRegistry.registerBlock((Block)plankJunglePolished, (String)"planksJunglePolished");
        stairPlankJunglePolished = new Stair(plankJunglePolished, "stairPlankJunglePolished");
        GameRegistry.registerBlock((Block)stairPlankJunglePolished, (String)"stairPlankJunglePolished");
        slabPlankJunglePolished = new Slab(plankJunglePolished, "slabPlankJunglePolished", false);
        doubleSlabPlankJunglePolished = new Slab(plankJunglePolished, "doubleSlabPlankJunglePolished", true);
        GameRegistry.registerBlock((Block)slabPlankJunglePolished, (String)"slabPlankJunglePolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankJunglePolished, (String)"doubleSlabPlankJunglePolished");
        wallPlanksJunglePolished = new Wall(plankJunglePolished, "wallPlanksJunglePolished");
        GameRegistry.registerBlock((Block)wallPlanksJunglePolished, (String)"wallPlanksJunglePolished");
        verticalSlabPlanksJunglePolished = new VerticalSlab(plankJunglePolished, "verticalSlabPlanksJunglePolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksJunglePolished, (String)"verticalSlabPlanksJunglePolished");
       
        plankOakPolished = new Wood("planksOakPolished", "modsda:planks_oak_polished");
        GameRegistry.registerBlock((Block)plankOakPolished, (String)"planksOakPolished");
        stairPlankOakPolished = new Stair(plankOakPolished, "stairPlankOakPolished");
        GameRegistry.registerBlock((Block)stairPlankOakPolished, (String)"stairPlankOakPolished");
        slabPlankOakPolished = new Slab(plankOakPolished, "slabPlankOakPolished", false);
        doubleSlabPlankOakPolished = new Slab(plankOakPolished, "doubleSlabPlankOakPolished", true);
        GameRegistry.registerBlock((Block)slabPlankOakPolished, (String)"slabPlankOakPolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankOakPolished, (String)"doubleSlabPlankOakPolished");
        wallPlanksOakPolished = new Wall(plankOakPolished, "wallPlanksOakPolished");
        GameRegistry.registerBlock((Block)wallPlanksOakPolished, (String)"wallPlanksOakPolished");
        verticalSlabPlanksOakPolished = new VerticalSlab(plankOakPolished, "verticalSlabPlanksOakPolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksOakPolished, (String)"verticalSlabPlanksOakPolished");
        
        plankSprucePolished = new Wood("planksSprucePolished", "modsda:planks_spruce_polished");
        GameRegistry.registerBlock((Block)plankSprucePolished, (String)"planksSprucePolished");
        stairPlankSprucePolished = new Stair(plankSprucePolished, "stairPlankSprucePolished");
        GameRegistry.registerBlock((Block)stairPlankSprucePolished, (String)"stairPlankSprucePolished");
        slabPlankSprucePolished = new Slab(plankSprucePolished, "slabPlankSprucePolished", false);
        doubleSlabPlankSprucePolished = new Slab(plankSprucePolished, "doubleSlabPlankSprucePolished", true);
        GameRegistry.registerBlock((Block)slabPlankSprucePolished, (String)"slabPlankSprucePolished");
        GameRegistry.registerBlock((Block)doubleSlabPlankSprucePolished, (String)"doubleSlabPlankSprucePolished");
        wallPlanksSprucePolished = new Wall(plankSprucePolished, "wallPlanksSprucePolished");
        GameRegistry.registerBlock((Block)wallPlanksSprucePolished, (String)"wallPlanksSprucePolished");
        verticalSlabPlanksSprucePolished = new VerticalSlab(plankSprucePolished, "verticalSlabPlanksSprucePolished");
        GameRegistry.registerBlock((Block)verticalSlabPlanksSprucePolished, (String)"verticalSlabPlanksSprucePolished");
       
        
        
        
        
        //VITRES
        
        vitreArcDroit = new Vitre("vitre", "modsda:vitre");
        GameRegistry.registerBlock((Block)vitreArcDroit, (String)"vitre");
       
        vitreQuadrillage = new Vitre("vitre2", "modsda:vitre2");
        GameRegistry.registerBlock((Block)vitreQuadrillage, (String)"vitre2");
       
        vitreArcGauche = new Vitre("vitre3", "modsda:vitre3");
        GameRegistry.registerBlock((Block)vitreArcGauche, (String)"vitre3");
      
        vitreMotif = new Vitre("vitre4", "modsda:vitre4");
        GameRegistry.registerBlock((Block)vitreMotif, (String)"vitre4");
       
        vitreTraitQuadrillageDroite = new Vitre("vitre5", "modsda:vitre5");
        GameRegistry.registerBlock((Block)vitreTraitQuadrillageDroite, (String)"vitre5");
       
        vitreTraitQuadrillageGauche = new Vitre("vitre6", "modsda:vitre6");
        GameRegistry.registerBlock((Block)vitreTraitQuadrillageGauche, (String)"vitre6");
       
        vitreMotifInverse = new Vitre("vitre7", "modsda:vitre7");
        GameRegistry.registerBlock((Block)vitreMotifInverse, (String)"vitre7");
       
        vitreTraitQuadrillageDroiteBis = new Vitre("vitre8", "modsda:vitre8");
        GameRegistry.registerBlock((Block)vitreTraitQuadrillageDroiteBis, (String)"vitre8");
       
        vitreTraitQuadrillageGaucheBis = new Vitre("vitre9", "modsda:vitre9");
        GameRegistry.registerBlock((Block)vitreTraitQuadrillageGaucheBis, (String)"vitre9");
       
        vitreCarreQuadrille = new Vitre("vitre10", "modsda:vitre10");
        GameRegistry.registerBlock((Block)vitreCarreQuadrille, (String)"vitre10");
       
        blocinvisible = new Vitre("blocinvisible", "modsda:vide");
        GameRegistry.registerBlock((Block)blocinvisible, (String)"blocinvisible");
       
        blocinvisibleBis = new Vitre("blocinvisibleBisLumineux", "modsda:blocinvisible").setLightLevel(25.0f);
        GameRegistry.registerBlock((Block)blocinvisibleBis, (String)"blocinvisibleBisLumineux");
       
        blocinvisibleTer = new Vitre("blocinvisibleTer", "modsda:blocinvisible1");
        GameRegistry.registerBlock((Block)blocinvisibleTer, (String)"blocinvisibleTer");
       
       
        
        
        
        //COLOMBAGES
        
        colombageBlancSlash = new Colombage("Colombage", "modsda:b_colombage");
        GameRegistry.registerBlock((Block)colombageBlancSlash, (String)"colombage");
       
        colombageBlancAntislash = new Colombage("Colombage2", "modsda:b_colombage2");
        GameRegistry.registerBlock((Block)colombageBlancAntislash, (String)"colombage2");
       
        colombageBlancCroix = new Colombage("Colombage3", "modsda:b_colombage3");
        GameRegistry.registerBlock((Block)colombageBlancCroix, (String)"colombage3");
       
        colombageBlancCirconflexe = new Colombage("Colombage4", "modsda:b_colombage4");
        GameRegistry.registerBlock((Block)colombageBlancCirconflexe, (String)"colombage4");
        
        colombageBlancV = new Colombage("Colombage5", "modsda:b_colombage5");
        GameRegistry.registerBlock((Block)colombageBlancV, (String)"colombage5");
       
        colombageMarronSlash = new Colombage("Colombage6", "modsda:b_colombage6");
        GameRegistry.registerBlock((Block)colombageMarronSlash, (String)"colombage6");
       
        colombageMarronAntislash = new Colombage("Colombage7", "modsda:b_colombage7");
        GameRegistry.registerBlock((Block)colombageMarronAntislash, (String)"colombage7");
       
        colombageMarronCroix = new Colombage("Colombage8", "modsda:b_colombage8");
        GameRegistry.registerBlock((Block)colombageMarronCroix, (String)"colombage8");
        
        colombageMarronCirconflexe = new Colombage("Colombage9", "modsda:b_colombage9");
        GameRegistry.registerBlock((Block)colombageMarronCirconflexe, (String)"colombage9");
        
        colombageMarronV = new Colombage("Colombage10", "modsda:b_colombage10");
        GameRegistry.registerBlock((Block)colombageMarronV, (String)"colombage10");
        
        colombageClairPlus = new Colombage("Colombage11", "modsda:b_colombage11");
        GameRegistry.registerBlock((Block)colombageClairPlus, (String)"colombage11");
        
        colombageClairV = new Colombage("Colombage12", "modsda:b_colombage12");
        GameRegistry.registerBlock((Block)colombageClairV, (String)"colombage12");
        
        colombageClairTube = new Colombage("Colombage13", "modsda:b_colombage13");
        GameRegistry.registerBlock((Block)colombageClairTube, (String)"colombage13");
        
        colombageClairOgive = new Colombage("Colombage14", "modsda:b_colombage14");
        GameRegistry.registerBlock((Block)colombageClairOgive, (String)"colombage14");
        
        colombageClairVide = new Colombage("Colombage15", "modsda:b_colombage15");
        GameRegistry.registerBlock((Block)colombageClairVide, (String)"colombage15");
        
        colombageBlancVide = new Colombage("Colombage16", "modsda:b_colombage16");
        GameRegistry.registerBlock((Block)colombageBlancVide, (String)"colombage16");
        
        colombageMarronVide = new Colombage("colombage17", "modsda:b_colombage17");
        GameRegistry.registerBlock((Block)colombageMarronVide, (String)"colombage17");
        
        colombageblanc = new Colombage("colombageblanc", "modsda:b_colombageblanc");
        GameRegistry.registerBlock((Block)colombageblanc, (String)"colombageblanc");
        
       
        
        
        
        //ETAGERES
        
        etagereBouteilleFull = new Bookshelf("etagere", "modsda:b_etagere");
        GameRegistry.registerBlock((Block)etagereBouteilleFull, (String)"etagere");
        
        etagereBouteilleGauche = new Bookshelf("etagere1", "modsda:b_etagere1");
        GameRegistry.registerBlock((Block)etagereBouteilleGauche, (String)"etagere1");
       
        etagereBouteilleMilieu = new Bookshelf("etagere2", "modsda:b_etagere2");
        GameRegistry.registerBlock((Block)etagereBouteilleMilieu, (String)"etagere2");
        
        etagereBouteilleDroite = new Bookshelf("etagere3", "modsda:b_etagere3");
        GameRegistry.registerBlock((Block)etagereBouteilleDroite, (String)"etagere3");
       
        placardFull = new Bookshelf("placard", "modsda:b_placard");
        GameRegistry.registerBlock((Block)placardFull, (String)"placard");
        
        placardGauche = new Bookshelf("placard1", "modsda:b_placard1");
        GameRegistry.registerBlock((Block)placardGauche, (String)"placard1");
       
        placardMilieu = new Bookshelf("placard2", "modsda:b_placard2");
        GameRegistry.registerBlock((Block)placardMilieu, (String)"placard2");
       
        placardDroite = new Bookshelf("placard3", "modsda:b_placard3");
        GameRegistry.registerBlock((Block)placardDroite, (String)"placard3");
        
        biblioparchermin = new Bookshelf("Biblioparchemin", "modsda:parchemin");
        GameRegistry.registerBlock((Block)biblioparchermin, (String)"Biblioparchemin");
        
        biblioparchemingauche = new Bookshelf("Biblioparchemingauche", "modsda:parchemin_gauche");
        GameRegistry.registerBlock((Block)biblioparchemingauche, (String)"Biblioparchemingauche");
        
        biblioparcheminmilieu = new Bookshelf("Biblioparcheminmilieu", "modsda:parchemin_milieu");
        GameRegistry.registerBlock((Block)biblioparcheminmilieu, (String)"Biblioparcheminmilieu");
       
        biblioparchemindroite = new Bookshelf("Biblioparchemindroite", "modsda:parchemin_droite");
        GameRegistry.registerBlock((Block)biblioparchemindroite, (String)"Biblioparchemindroite");
       
        bibliothequeBis = new Bookshelf("bibliothequeBis", "modsda:bookshelf");
        GameRegistry.registerBlock((Block)bibliothequeBis, (String)"bibliothequeBis");
        
        bibliothequeBis2 = new Bookshelf("bibliothequeBis2", "modsda:bookshelfBis");
        GameRegistry.registerBlock((Block)bibliothequeBis2, (String)"bibliothequeBis2");
        
        bookshelfEmpty = new Bookshelf("bookshelfEmpty", "modsda:bookshelfEmpty");
        GameRegistry.registerBlock((Block)bookshelfEmpty, (String)"bookshelfEmpty");
        
        bookshelf2 = new Bookshelf("bookshelf2", "modsda:bookshelf2");
        GameRegistry.registerBlock((Block)bookshelf2, (String)"bookshelf2");
       
        bookshelf3 = new Bookshelf("bookshelf3", "modsda:bookshelf3");
        GameRegistry.registerBlock((Block)bookshelf3, (String)"bookshelf3");
      
        bookshelf4 = new Bookshelf("bookshelf4", "modsda:bookshelf4");
        GameRegistry.registerBlock((Block)bookshelf4, (String)"bookshelf4");
      
        bookshelf5 = new Bookshelf("bookshelf5", "modsda:bookshelf5");
        GameRegistry.registerBlock((Block)bookshelf5, (String)"bookshelf5");
       
        bookshelf6 = new Bookshelf("bookshelf6", "modsda:bookshelf6");
        GameRegistry.registerBlock((Block)bookshelf6, (String)"bookshelf6");
        
        bookshelfBisEmpty = new Bookshelf("bookshelfBisEmpty", "modsda:bookshelfBisEmpty");
        GameRegistry.registerBlock((Block)bookshelfBisEmpty, (String)"bookshelfBisEmpty");
        
        bookshelfBis2 = new Bookshelf("bookshelfBis2", "modsda:bookshelfBis2");
        GameRegistry.registerBlock((Block)bookshelfBis2, (String)"bookshelfBis2");
       
        bookshelfBis3 = new Bookshelf("bookshelfBis3", "modsda:bookshelfBis3");
        GameRegistry.registerBlock((Block)bookshelfBis3, (String)"bookshelfBis3");
       
        bookshelfBis4 = new Bookshelf("bookshelfBis4", "modsda:bookshelfBis4");
        GameRegistry.registerBlock((Block)bookshelfBis4, (String)"bookshelfBis4");
        
        bookshelfBis5 = new Bookshelf("bookshelfBis5", "modsda:bookshelfBis5");
        GameRegistry.registerBlock((Block)bookshelfBis5, (String)"bookshelfBis5");
        
        bookshelfTer = new Bookshelf("bookshelfTer", "modsda:bookshelfTer");
        GameRegistry.registerBlock((Block)bookshelfTer, (String)"bookshelfTer");
        
        bookshelfTer2 = new Bookshelf("bookshelfTer2", "modsda:bookshelfTer2");
        GameRegistry.registerBlock((Block)bookshelfTer2, (String)"bookshelfTer2");
       
        bookshelfTer3 = new Bookshelf("bookshelfTer3", "modsda:bookshelfTer3");
        GameRegistry.registerBlock((Block)bookshelfTer3, (String)"bookshelfTer3");
        
        bookshelfTer4 = new Bookshelf("bookshelfTer4", "modsda:bookshelfTer4");
        GameRegistry.registerBlock((Block)bookshelfTer4, (String)"bookshelfTer4");
        
        bookshelfTer5 = new Bookshelf("bookshelfTer5", "modsda:bookshelfTer5");
        GameRegistry.registerBlock((Block)bookshelfTer5, (String)"bookshelfTer5");
        
        bookshelfTer6 = new Bookshelf("bookshelfTer6", "modsda:bookshelfTer6");
        GameRegistry.registerBlock((Block)bookshelfTer6, (String)"bookshelfTer6");
        
        bookshelfTer7 = new Bookshelf("bookshelfTer7", "modsda:bookshelfTer7");
        GameRegistry.registerBlock((Block)bookshelfTer7, (String)"bookshelfTer7");
        
        bookshelfTer8 = new Bookshelf("bookshelfTer8", "modsda:bookshelfTer8");
        GameRegistry.registerBlock((Block)bookshelfTer8, (String)"bookshelfTer8");
        
        bibliothequenew = new Bookshelf("bibliothequenew", "modsda:bibliothequenew");
        GameRegistry.registerBlock((Block)bibliothequenew, (String)"bibliothequenew");
        
        bibliothequenewmilieu = new Bookshelf("bibliothequenewmilieu", "modsda:bibliothequenewmilieu");
        GameRegistry.registerBlock((Block)bibliothequenewmilieu, (String)"bibliothequenewmilieu");
        
        bibliothequenewgauche = new Bookshelf("bibliothequenewgauche", "modsda:bibliothequenewgauche");
        GameRegistry.registerBlock((Block)bibliothequenewgauche, (String)"bibliothequenewgauche");
        
        bibliothequenewdroite = new Bookshelf("bibliothequenewdroite", "modsda:bibliothequenewdroite");
        GameRegistry.registerBlock((Block)bibliothequenewdroite, (String)"bibliothequenewdroite");
        
        
        
        
        
        
        
        //BLOCS CONSTRUCTION
        
        quicksandnew = new Rock("quicksandnew", "modsda:quicksandnew");
        GameRegistry.registerBlock((Block)quicksandnew, (String)"quicksandnew");
        stairquicksandnew = new Stair(quicksandnew, "stairquicksandnew");
        GameRegistry.registerBlock((Block)stairquicksandnew, (String)"stairquicksandnew");
        slabquicksandnew = new Slab(quicksandnew, "slabquicksandnew", false);
        doubleSlabquicksandnew = new Slab(quicksandnew, "doubleSlabquicksandnew", true);
        GameRegistry.registerBlock((Block)slabquicksandnew, (Class)ItemDalle.class, (String)"slabquicksandnew");
        GameRegistry.registerBlock((Block)doubleSlabquicksandnew, (Class)ItemDalle.class, (String)"doubleSlabquicksandnew");
        wallquicksandnew = new Wall(quicksandnew, "wallquicksandnew");
        GameRegistry.registerBlock((Block)wallquicksandnew, (String)"wallquicksandnew");
        verticalquicksandnew = new VerticalSlab(quicksandnew, "verticalSlabquicksandnew");
        GameRegistry.registerBlock((Block)verticalquicksandnew, (String)"verticalSlabquicksandnew");
        
        farmland1 = new Dirt("farmland1", "modsda:farmland1");
        GameRegistry.registerBlock((Block)farmland1, (String)"farmland1");
        
        farmland2 = new Dirt("farmland2", "modsda:farmland2");
        GameRegistry.registerBlock((Block)farmland2, (String)"farmland2");   
        
        blackrocknew = new Rock("blackrocknew", "modsda:blackrocknew");
        GameRegistry.registerBlock((Block)blackrocknew, (String)"blackrocknew");
        stairblackrocknew = new Stair(blackrocknew, "stairblackrocknew");
        GameRegistry.registerBlock((Block)stairblackrocknew, (String)"stairblackrocknew");
        slabblackrocknew = new Slab(blackrocknew, "slabblackrocknew", false);
        doubleSlabblackrocknew = new Slab(blackrocknew, "doubleSlabblackrocknew", true);
        GameRegistry.registerBlock((Block)slabblackrocknew, (Class)ItemDalle.class, (String)"slabblackrocknew");
        GameRegistry.registerBlock((Block)doubleSlabblackrocknew, (Class)ItemDalle.class, (String)"doubleSlabblackrocknew");
        wallblackrocknew = new Wall(blackrocknew, "wallblackrocknew");
        GameRegistry.registerBlock((Block)wallblackrocknew, (String)"wallblackrocknew");
        verticalblackrocknew = new VerticalSlab(blackrocknew, "verticalSlabblackrocknew");
        GameRegistry.registerBlock((Block)verticalblackrocknew, (String)"verticalSlabblackrocknew");
        
        crackedsandNew = new Rock("crackedsandNew", "modsda:crackedsandNew");
        GameRegistry.registerBlock((Block)crackedsandNew, (String)"crackedsandNew");
        staircrackedsandNew = new Stair(crackedsandNew, "staircrackedsandNew");
        GameRegistry.registerBlock((Block)staircrackedsandNew, (String)"staircrackedsandNew");
        slabcrackedsandNew = new Slab(crackedsandNew, "slabcrackedsandNew", false);
        doubleSlabcrackedsandNew = new Slab(crackedsandNew, "doubleSlabcrackedsandNew", true);
        GameRegistry.registerBlock((Block)slabcrackedsandNew, (Class)ItemDalle.class, (String)"slabcrackedsandNew");
        GameRegistry.registerBlock((Block)doubleSlabcrackedsandNew, (Class)ItemDalle.class, (String)"doubleSlabcrackedsandNew");
        wallcrackedsandNew = new Wall(crackedsandNew, "wallcrackedsandNew");
        GameRegistry.registerBlock((Block)wallcrackedsandNew, (String)"wallcrackedsandNew");
        verticalcrackedsandNew = new VerticalSlab(crackedsandNew, "verticalSlabcrackedsandNew");
        GameRegistry.registerBlock((Block)verticalcrackedsandNew, (String)"verticalSlabcrackedsandNew");
        
        end_stone = new Rock("end_stone", "modsda:end_stone");
        GameRegistry.registerBlock((Block)end_stone, (String)"end_stone");
        stairend_stone = new Stair(end_stone, "stairend_stone");
        GameRegistry.registerBlock((Block)stairend_stone, (String)"stairend_stone");
        slabend_stone = new Slab(end_stone, "slabend_stone", false);
        doubleSlabend_stone = new Slab(end_stone, "doubleSlabend_stone", true);
        GameRegistry.registerBlock((Block)slabend_stone, (Class)ItemDalle.class, (String)"slabend_stone");
        GameRegistry.registerBlock((Block)doubleSlabend_stone, (Class)ItemDalle.class, (String)"doubleSlabend_stone");
        wallend_stone = new Wall(end_stone, "wallend_stone");
        GameRegistry.registerBlock((Block)wallend_stone, (String)"wallend_stone");
        verticalend_stone = new VerticalSlab(end_stone, "verticalSlabend_stone");
        GameRegistry.registerBlock((Block)verticalend_stone, (String)"verticalSlabend_stone");
        
        end_bricks = new Rock("end_bricks", "modsda:end_bricks");
        GameRegistry.registerBlock((Block)end_bricks, (String)"end_bricks");
        stairend_bricks = new Stair(end_bricks, "stairend_bricks");
        GameRegistry.registerBlock((Block)stairend_bricks, (String)"stairend_bricks");
        slabend_bricks = new Slab(end_bricks, "slabend_bricks", false);
        doubleSlabend_bricks = new Slab(end_bricks, "doubleSlabend_bricks", true);
        GameRegistry.registerBlock((Block)slabend_bricks, (Class)ItemDalle.class, (String)"slabend_bricks");
        GameRegistry.registerBlock((Block)doubleSlabend_bricks, (Class)ItemDalle.class, (String)"doubleSlabend_bricks");
        wallend_bricks = new Wall(end_bricks, "wallend_bricks");
        GameRegistry.registerBlock((Block)wallend_bricks, (String)"wallend_bricks");
        verticalend_bricks = new VerticalSlab(end_bricks, "verticalSlabend_bricks");
        GameRegistry.registerBlock((Block)verticalend_bricks, (String)"verticalSlabend_bricks");

        
        cobbleStoneDarknew = new Rock("cobbleStoneDarknew", "modsda:cobblestone");
        GameRegistry.registerBlock((Block)cobbleStoneDarknew, (String)"cobbleStoneDarknew");
        staircobbleStoneDarknew = new Stair(cobbleStoneDarknew, "staircobbleStoneDarknew");
        GameRegistry.registerBlock((Block)staircobbleStoneDarknew, (String)"staircobbleStoneDarknew");
        slabcobbleStoneDarknew = new Slab(cobbleStoneDarknew, "slabcobbleStoneDarknew", false);
        doubleSlabcobbleStoneDarknew = new Slab(cobbleStoneDarknew, "doubleSlabcobbleStoneDarknew", true);
        GameRegistry.registerBlock((Block)slabcobbleStoneDarknew, (Class)ItemDalle.class, (String)"slabcobbleStoneDarknew");
        GameRegistry.registerBlock((Block)doubleSlabcobbleStoneDarknew, (Class)ItemDalle.class, (String)"doubleSlabcobbleStoneDarknew");
        wallcobbleStoneDarknew = new Wall(cobbleStoneDarknew, "wallcobbleStoneDarknew");
        GameRegistry.registerBlock((Block)wallcobbleStoneDarknew, (String)"wallcobbleStoneDarknew");
        verticalSlabcobbleStoneDarknew = new VerticalSlab(cobbleStoneDarknew, "verticalSlabcobbleStoneDarknew");
        GameRegistry.registerBlock((Block)verticalSlabcobbleStoneDarknew, (String)"verticalSlabcobbleStoneDarknew");
        
        
        stoneDarkNew = new Rock("StoneDarknew", "modsda:stone");
        GameRegistry.registerBlock((Block)stoneDarkNew, (String)"StoneDarknew");
        stairstoneDarkNew = new Stair(stoneDarkNew, "stairStoneDarknew");
        GameRegistry.registerBlock((Block)stairstoneDarkNew, (String)"stairStoneDarknew");
        slabstoneDarkNew = new Slab(stoneDarkNew, "slabStoneDarknew", false);
        doubleSlabcobbleStoneDarknew = new Slab(stoneDarkNew, "doubleSlabStoneDarknew", true);
        GameRegistry.registerBlock((Block)slabstoneDarkNew, (Class)ItemDalle.class, (String)"slabStoneDarknew");
        GameRegistry.registerBlock((Block)doubleSlabcobbleStoneDarknew, (Class)ItemDalle.class, (String)"doubleSlabStoneDarknew");
        wallstoneDarkNew = new Wall(stoneDarkNew, "wallStoneDarknew");
        GameRegistry.registerBlock((Block)wallstoneDarkNew, (String)"wallStoneDarknew");
        verticalSlabstoneDarkNew = new VerticalSlab(stoneDarkNew, "verticalSlabStoneDarknew");
        GameRegistry.registerBlock((Block)verticalSlabstoneDarkNew, (String)"verticalSlabStoneDarknew");
        
        
        stoneBrickDarkNew = new Rock("stoneBrickDarkNew", "modsda:stonebrick");
        GameRegistry.registerBlock((Block)stoneBrickDarkNew, (String)"stoneBrickDarkNew");
        stairstoneBrickDarkNew = new Stair(stoneBrickDarkNew, "stairstoneBrickDarkNew");
        GameRegistry.registerBlock((Block)stairstoneBrickDarkNew, (String)"stairstoneBrickDarkNew");
        slabstoneBrickDarkNew = new Slab(stoneBrickDarkNew, "slabstoneBrickDarkNew", false);
        doubleSlabstoneBrickDarkNew = new Slab(stoneBrickDarkNew, "doubleSlabstoneBrickDarkNew", true);
        GameRegistry.registerBlock((Block)slabstoneBrickDarkNew, (Class)ItemDalle.class, (String)"slabstoneBrickDarkNew");
        GameRegistry.registerBlock((Block)doubleSlabstoneBrickDarkNew, (Class)ItemDalle.class, (String)"doubleSlabstoneBrickDarkNew");
        wallstoneBrickDarkNew = new Wall(stoneBrickDarkNew, "wallstoneBrickDarkNew");
        GameRegistry.registerBlock((Block)wallstoneBrickDarkNew, (String)"wallstoneBrickDarkNew");
        verticalSlabstoneBrickDarkNew = new VerticalSlab(stoneBrickDarkNew, "verticalSlabstoneBrickDarkNew");
        GameRegistry.registerBlock((Block)verticalSlabstoneBrickDarkNew, (String)"verticalSlabstoneBrickDarkNew");
        
        
        stoneBrickCarvedDarkNew = new Rock("stoneBrickCarvedDarkNew", "modsda:stonebrick_carved");
        GameRegistry.registerBlock((Block)stoneBrickCarvedDarkNew, (String)"stoneBrickCarvedDarkNew");
        stairstoneBrickCarvedDarkNew = new Stair(stoneBrickCarvedDarkNew, "stairstoneBrickCarvedDarkNew");
        GameRegistry.registerBlock((Block)stairstoneBrickCarvedDarkNew, (String)"stairstoneBrickCarvedDarkNew");
        slabstoneBrickCarvedDarkNew = new Slab(stoneBrickCarvedDarkNew, "slabstoneBrickCarvedDarkNew", false);
        doubleSlabstoneBrickCarvedDarkNew = new Slab(stoneBrickCarvedDarkNew, "doublestoneBrickCarvedDarkNew", true);
        GameRegistry.registerBlock((Block)slabstoneBrickCarvedDarkNew, (Class)ItemDalle.class, (String)"slabstoneBrickCarvedDarkNew");
        GameRegistry.registerBlock((Block)doubleSlabstoneBrickCarvedDarkNew, (Class)ItemDalle.class, (String)"doubleSlabstoneBrickCarvedDarkNew");
        wallstoneBrickCarvedDarkNew = new Wall(stoneBrickCarvedDarkNew, "wallstoneBrickCarvedDarkNew");
        GameRegistry.registerBlock((Block)wallstoneBrickCarvedDarkNew, (String)"wallstoneBrickCarvedDarkNew");
        verticalSlabstoneBrickCarvedDarkNew = new VerticalSlab(stoneBrickCarvedDarkNew, "verticalSlabstoneBrickCarvedDarkNew");
        GameRegistry.registerBlock((Block)verticalSlabstoneBrickCarvedDarkNew, (String)"verticalSlabstoneBrickCarvedDarkNew");
        
       
        sableBlanc = new Thatch("sableBlanc", "modsda:sableBlanc");
        GameRegistry.registerBlock((Block)sableBlanc, (String)"sableBlanc");
        stairsableBlanc = new Stair(sableBlanc, "stairsableBlanc");
        GameRegistry.registerBlock((Block)stairsableBlanc, (String)"stairsableBlanc");
        slabsableBlanc = new Slab(sableBlanc, "slabsableBlanc", false);
        doubleSlabsableBlanc = new Slab(sableBlanc, "doublesableBlanc", true);
        GameRegistry.registerBlock((Block)slabsableBlanc, (Class)ItemDalle.class, (String)"slabsableBlanc");
        GameRegistry.registerBlock((Block)doubleSlabsableBlanc, (Class)ItemDalle.class, (String)"doubleSlabsableBlanc");
        wallsableBlanc = new Wall(sableBlanc, "wallsableBlanc");
        GameRegistry.registerBlock((Block)wallsableBlanc, (String)"wallsableBlanc");
        verticalSlabsableBlanc = new VerticalSlab(sableBlanc, "verticalSlabsableBlanc");
        GameRegistry.registerBlock((Block)verticalSlabsableBlanc, (String)"verticalSlabsableBlanc");
       
        sableBlanc2 = new Thatch("sableBlanc2", "modsda:sableBlanc2");
        GameRegistry.registerBlock((Block)sableBlanc2, (String)"sableBlanc2");
        stairsableBlanc2 = new Stair(sableBlanc2, "stairsableBlanc2");
        GameRegistry.registerBlock((Block)stairsableBlanc2, (String)"stairsableBlanc2");
        slabsableBlanc2 = new Slab(sableBlanc2, "slabsableBlanc2", false);
        doubleSlabsableBlanc2 = new Slab(sableBlanc2, "doublesableBlanc2", true);
        GameRegistry.registerBlock((Block)slabsableBlanc2, (Class)ItemDalle.class, (String)"slabsableBlanc2");
        GameRegistry.registerBlock((Block)doubleSlabsableBlanc2, (Class)ItemDalle.class, (String)"doubleSlabsableBlanc2");
        wallsableBlanc2 = new Wall(sableBlanc2, "wallsableBlanc2");
        GameRegistry.registerBlock((Block)wallsableBlanc2, (String)"wallsableBlanc2");
        verticalSlabsableBlanc2 = new VerticalSlab(sableBlanc2, "verticalSlabsableBlanc2");
        GameRegistry.registerBlock((Block)verticalSlabsableBlanc2, (String)"verticalSlabsableBlanc2");
        
        sableBlanc3 = new Thatch("sableBlanc3", "modsda:sableBlanc3");
        GameRegistry.registerBlock((Block)sableBlanc3, (String)"sableBlanc3");
        stairsableBlanc3 = new Stair(sableBlanc3, "stairsableBlanc3");
        GameRegistry.registerBlock((Block)stairsableBlanc3, (String)"stairsableBlanc3");
        slabsableBlanc3 = new Slab(sableBlanc3, "slabsableBlanc3", false);
        doubleSlabsableBlanc3 = new Slab(sableBlanc3, "doublesableBlanc3", true);
        GameRegistry.registerBlock((Block)slabsableBlanc3, (Class)ItemDalle.class, (String)"slabsableBlanc3");
        GameRegistry.registerBlock((Block)doubleSlabsableBlanc3, (Class)ItemDalle.class, (String)"doubleSlabsableBlanc3");
        wallsableBlanc3 = new Wall(sableBlanc3, "wallsableBlanc3");
        GameRegistry.registerBlock((Block)wallsableBlanc3, (String)"wallsableBlanc3");
        verticalSlabsableBlanc3 = new VerticalSlab(sableBlanc3, "verticalSlabsableBlanc3");
        GameRegistry.registerBlock((Block)verticalSlabsableBlanc3, (String)"verticalSlabsableBlanc3");
       
        orange_sandstonenew = new Rock("orange_sandstonenew", "modsda:orange_sandstone");
        GameRegistry.registerBlock((Block)orange_sandstonenew, (String)"orange_sandstonenew");
        stairorange_sandstonenew = new Stair(orange_sandstonenew, "stairorange_sandstonenew");
        GameRegistry.registerBlock((Block)stairorange_sandstonenew, (String)"stairorange_sandstonenew");
        slaborange_sandstonenew = new Slab(orange_sandstonenew, "slaborange_sandstonenew", false);
        doubleSlaborange_sandstonenew = new Slab(orange_sandstonenew, "doubleSlaborange_sandstonenew", true);
        GameRegistry.registerBlock((Block)slaborange_sandstonenew, (Class)ItemDalle.class, (String)"slaborange_sandstonenew");
        GameRegistry.registerBlock((Block)doubleSlaborange_sandstonenew, (Class)ItemDalle.class, (String)"doubleSlaborange_sandstonenew");
        wallorange_sandstonenew = new Wall(orange_sandstonenew, "wallorange_sandstonenew");
        GameRegistry.registerBlock((Block)wallorange_sandstonenew, (String)"wallorange_sandstonenew");
        verticalSlaborange_sandstonenew = new VerticalSlab(orange_sandstonenew, "verticalSlaborange_sandstonenew");
        GameRegistry.registerBlock((Block)verticalSlaborange_sandstonenew, (String)"verticalSlaborange_sandstonenew");
        
        orange_sandstone_normalnew = new Rock("orange_sandstone_normalnew", "modsda:orange_sandstone_normal");
        GameRegistry.registerBlock((Block)orange_sandstone_normalnew, (String)"orange_sandstone_normalnew");
        stairorange_sandstone_normalnew = new Stair(orange_sandstone_normalnew, "stairorange_sandstone_normalnew");
        GameRegistry.registerBlock((Block)stairorange_sandstone_normalnew, (String)"stairorange_sandstone_normalnew");
        slaborange_sandstone_normalnew = new Slab(orange_sandstone_normalnew, "slaborange_sandstone_normalnew", false);
        doubleSlaborange_sandstone_normalnew = new Slab(orange_sandstone_normalnew, "doubleSlaborange_sandstone_normalnew", true);
        GameRegistry.registerBlock((Block)slaborange_sandstone_normalnew, (Class)ItemDalle.class, (String)"slaborange_sandstone_normalnew");
        GameRegistry.registerBlock((Block)doubleSlaborange_sandstone_normalnew, (Class)ItemDalle.class, (String)"doubleSlaborange_sandstone_normalnew");
        wallorange_sandstone_normalnew = new Wall(orange_sandstone_normalnew, "wallorange_sandstone_normalnew");
        GameRegistry.registerBlock((Block)wallorange_sandstone_normalnew, (String)"wallorange_sandstone_normalnew");
        verticalSlaborange_sandstone_normalnew = new VerticalSlab(orange_sandstone_normalnew, "verticalSlaborange_sandstone_normalnew");
        GameRegistry.registerBlock((Block)verticalSlaborange_sandstone_normalnew, (String)"verticalSlaborange_sandstone_normalnew");
        
        ironbrick = new Rock("ironBrick", "modsda:iron_brick");
        GameRegistry.registerBlock((Block)ironbrick, (String)"ironBrick");
        stairIronbrick = new Stair(ironbrick, "stairIronbrick");
        GameRegistry.registerBlock((Block)stairIronbrick, (String)"stairIronbrick");
        slabIronbrick = new Slab(ironbrick, "slabIronbrick", false);
        doubleSlabIronbrick = new Slab(ironbrick, "doubleSlabIronbrick", true);
        GameRegistry.registerBlock((Block)slabIronbrick, (String)"slabIronbrick");
        GameRegistry.registerBlock((Block)doubleSlabIronbrick, (String)"doubleSlabIronbrick");
        wallIronbrick = new Wall(ironbrick, "wallIronbrick");
        GameRegistry.registerBlock((Block)wallIronbrick, (String)"wallIronbrick");
        verticalSlabIronbrick = new VerticalSlab(ironbrick, "verticalSlabIronbrick");
        GameRegistry.registerBlock((Block)verticalSlabIronbrick, (String)"verticalSlabIronbrick");
        
        slate = new Rock("slate", "modsda:slate");
        GameRegistry.registerBlock((Block)slate, (String)"slate");
        stairSlate = new Stair(slate, "stairSlate");
        GameRegistry.registerBlock((Block)stairSlate, (String)"stairSlate");
        slabSlate = new Slab(slate, "slabSlate", false);
        doubleSlabSlate = new Slab(slate, "doubleSlabSlate", true);
        GameRegistry.registerBlock((Block)slabSlate, (String)"slabSlate");
        GameRegistry.registerBlock((Block)doubleSlabSlate, (String)"doubleSlabSlate");
        verticalSlabSlate = new VerticalSlab(slate, "verticalSlabSlate");
        GameRegistry.registerBlock((Block)verticalSlabSlate, (String)"verticalSlabSlate");
        
        darkSlate = new Rock("darkDarkSlate", "modsda:slate_dark");
        GameRegistry.registerBlock((Block)darkSlate, (String)"darkDarkSlate");
        stairDarkSlate = new Stair(darkSlate, "stairDarkSlate");
        GameRegistry.registerBlock((Block)stairDarkSlate, (String)"stairDarkSlate");
        slabDarkSlate = new Slab(darkSlate, "slabDarkSlate", false);
        doubleSlabDarkSlate = new Slab(darkSlate, "doubleSlabDarkSlate", true);
        GameRegistry.registerBlock((Block)slabDarkSlate, (String)"slabDarkSlate");
        GameRegistry.registerBlock((Block)doubleSlabDarkSlate, (String)"doubleSlabDarkSlate");
        verticalSlabDarkSlate = new VerticalSlab(darkSlate, "verticalSlabDarkSlate");
        GameRegistry.registerBlock((Block)verticalSlabDarkSlate, (String)"verticalSlabDarkSlate");
        
        blackSlate = new Rock("blackBlackSlate", "modsda:slate_black");
        GameRegistry.registerBlock((Block)blackSlate, (String)"blackBlackSlate");
        stairBlackSlate = new Stair(blackSlate, "stairBlackSlate");
        GameRegistry.registerBlock((Block)stairBlackSlate, (String)"stairBlackSlate");
        slabBlackSlate = new Slab(blackSlate, "slabBlackSlate", false);
        doubleSlabBlackSlate = new Slab(blackSlate, "doubleSlabBlackSlate", true);
        GameRegistry.registerBlock((Block)slabBlackSlate, (String)"slabBlackSlate");
        GameRegistry.registerBlock((Block)doubleSlabBlackSlate, (String)"doubleSlabBlackSlate");
        verticalSlabBlackSlate = new VerticalSlab(blackSlate, "verticalSlabBlackSlate");
        GameRegistry.registerBlock((Block)verticalSlabBlackSlate, (String)"verticalSlabBlackSlate");
        
        slateEsgaroth = new Rock("slateEsgaroth", "modsda:slate_esgaroth");
        GameRegistry.registerBlock((Block)slateEsgaroth, (String)"slateEsgaroth");
        stairSlateEsgaroth = new Stair(slateEsgaroth, "stairSlateEsgaroth");
        GameRegistry.registerBlock((Block)stairSlateEsgaroth, (String)"stairSlateEsgaroth");
        slabSlateEsgaroth = new Slab(slateEsgaroth, "slabSlateEsgaroth", false);
        doubleSlabSlateEsgaroth = new Slab(slateEsgaroth, "doubleSlabSlateEsgaroth", true);
        GameRegistry.registerBlock((Block)slabSlateEsgaroth, (String)"slabSlateEsgaroth");
        GameRegistry.registerBlock((Block)doubleSlabSlateEsgaroth, (String)"doubleSlabSlateEsgaroth");
        verticalSlabSlateEsgaroth = new VerticalSlab(slateEsgaroth, "verticalSlabSlateEsgaroth");
        GameRegistry.registerBlock((Block)verticalSlabSlateEsgaroth, (String)"verticalSlabSlateEsgaroth");
        
        tile = new Rock("tile", "modsda:tile");
        GameRegistry.registerBlock((Block)tile, (String)"tile");
        stairTile = new Stair(tile, "stairTile");
        GameRegistry.registerBlock((Block)stairTile, (String)"stairTile");
        slabTile = new Slab(tile, "slabTile", false);
        doubleSlabTile = new Slab(tile, "doubleSlabTile", true);
        GameRegistry.registerBlock((Block)slabTile, (String)"slabTile");
        GameRegistry.registerBlock((Block)doubleSlabTile, (String)"doubleSlabTile");
        verticalSlabTile = new VerticalSlab(tile, "verticalSlabTile");
        GameRegistry.registerBlock((Block)verticalSlabTile, (String)"verticalSlabTile");
        
        stairWhiteColombage = new Stair(colombageblanc, "stairWhiteColombage");
        GameRegistry.registerBlock((Block)stairWhiteColombage, (String)"stairWhiteColombage");
        slabWhiteColombage = new Slab(colombageblanc, "slabWhiteColombage", false);
        doubleSlabWhiteColombage = new Slab(colombageblanc, "doubleSlabWhiteColombage", true);
        GameRegistry.registerBlock((Block)slabWhiteColombage, (String)"slabWhiteColombage");
        GameRegistry.registerBlock((Block)doubleSlabWhiteColombage, (String)"doubleSlabWhiteColombage");
        verticalSlabWhiteColombage = new VerticalSlab(colombageblanc, "verticalSlabWhiteColombage");
        GameRegistry.registerBlock((Block)verticalSlabWhiteColombage, (String)"verticalSlabWhiteColombage");
        
        greyHaze = new Haze("greyHaze", "modsda:fumee_grise", 50);
        GameRegistry.registerBlock((Block)greyHaze, (String)"greyHaze");
        
        blackHaze = new Haze("blackHaze", "modsda:fumee_noire", 100);
        GameRegistry.registerBlock((Block)blackHaze, (String)"blackHaze");
        
        goldenIngot = new Lingot("bblocd'or", "modsda:or");
        GameRegistry.registerBlock((Block)goldenIngot, (String)"bblocd'or");
        
        ironIngot = new Lingot("ironIngot", "modsda:ironIngot");
        GameRegistry.registerBlock((Block)ironIngot, (String)"ironIngot");
        
        stone1 = new Rock("stone", "modsda:stone");
        GameRegistry.registerBlock((Block)stone1, (String)"stone1");
        stairStone = new Stair(stone1, "stairStone");
        GameRegistry.registerBlock((Block)stairStone, (String)"stairStone");
        slabStone = new Slab(stone1, "slabStone", false);
        doubleSlabStone = new Slab(stone1, "doubleSlabStone", true);
        GameRegistry.registerBlock((Block)slabStone, (String)"slabStone");
        GameRegistry.registerBlock((Block)doubleSlabStone, (String)"doubleSlabStone");
        verticalSlabStone1 = new VerticalSlab(stone1, "verticalSlabStone1");
        GameRegistry.registerBlock((Block)verticalSlabStone1, (String)"verticalSlabStone1");
       
        gresTaille = new Rock("sandbrick", "modsda:sandbrick");
        GameRegistry.registerBlock((Block)gresTaille, (String)"sandbrick");
        stairGresTaille = new Stair(gresTaille, "escalierGresBis");
        GameRegistry.registerBlock((Block)stairGresTaille, (String)"escalierGresBis");
        slabGresTaille = new Slab(gresTaille, "slabGresTaille", false);
        doubleSlabGresTaille = new Slab(gresTaille, "doubleSlabGresTaille", true);
        GameRegistry.registerBlock((Block)slabGresTaille, (String)"slabGresTaille");
        GameRegistry.registerBlock((Block)doubleSlabGresTaille, (String)"doubleSlabGresTaille");
        wallGresTaille = new Wall(gresTaille, "wallGresTaille");
        GameRegistry.registerBlock((Block)wallGresTaille, (String)"wallGresTaille");
        verticalSlabGresTaille = new VerticalSlab(gresTaille, "verticalSlabGresTaille");
        GameRegistry.registerBlock((Block)verticalSlabGresTaille, (String)"verticalSlabGresTaille");
        
        briqueNoireAngmar = new Rock("stoneBrickBis2", "modsda:stoneBrickBis2");
        GameRegistry.registerBlock((Block)briqueNoireAngmar, (String)"stoneBrickBis2");
        stairBriqueNoireAngmar = new Stair(briqueNoireAngmar, "stairStoneBrickBis2");
        GameRegistry.registerBlock((Block)stairBriqueNoireAngmar, (String)"stairStoneBrickBis2");
        slabBriqueNoireAngmar = new Slab(briqueNoireAngmar, "slabBriqueNoireAngmar", false);
        doubleSlabBriqueNoireAngmar = new Slab(briqueNoireAngmar, "doubleSlabBriqueNoireAngmar", true);
        GameRegistry.registerBlock((Block)slabBriqueNoireAngmar, (Class)ItemDalle.class, (String)"slabBriqueNoireAngmar");
        GameRegistry.registerBlock((Block)doubleSlabBriqueNoireAngmar, (Class)ItemDalle.class, (String)"doubleSlabBriqueNoireAngmar");
        wallBriqueNoireAngmar = new Wall(briqueNoireAngmar, "wallBriqueNoireAngmar");
        GameRegistry.registerBlock((Block)wallBriqueNoireAngmar, (String)"wallBriqueNoireAngmar");
        verticalSlabBriqueNoireAngmar = new VerticalSlab(briqueNoireAngmar, "verticalSlabBriqueNoireAngmar");
        GameRegistry.registerBlock((Block)verticalSlabBriqueNoireAngmar, (String)"verticalSlabBriqueNoireAngmar");
        
        stoneBrickCarved = new Rock("stoneBrickCarved", "modsda:stoneBrickCarved");
        GameRegistry.registerBlock((Block)stoneBrickCarved, (String)"stoneBrickCarved");
        
        briqueCraqueleeAngmar = new Rock("stoneBrickCracked", "modsda:stoneBrickCracked");
        GameRegistry.registerBlock((Block)briqueCraqueleeAngmar, (String)"stoneBrickCracked");
        stairStoneBrickCaqueleeAngmar = new Stair(briqueCraqueleeAngmar, "stairStoneBrickCracked");
        GameRegistry.registerBlock((Block)stairStoneBrickCaqueleeAngmar, (String)"stairStoneBrickCracked");
        slabBriqueNoireCraqueleeAngmar = new Slab(briqueCraqueleeAngmar, "slabBriqueNoireCraqueleeAngmar", false);
        doubleSlabBriqueNoireCraqueleeAngmar = new Slab(briqueCraqueleeAngmar, "doubleSlabBriqueNoireCraqueleeAngmar", true);
        GameRegistry.registerBlock((Block)slabBriqueNoireCraqueleeAngmar, (Class)ItemDalle.class, (String)"slabBriqueNoireCraqueleeAngmar");
        GameRegistry.registerBlock((Block)doubleSlabBriqueNoireCraqueleeAngmar, (Class)ItemDalle.class, (String)"doubleSlabBriqueNoireCraqueleeAngmar");
        wallBriqueNoireCraqueleeAngmar = new Wall(briqueCraqueleeAngmar, "wallBriqueNoireCraqueleeAngmar");
        GameRegistry.registerBlock((Block)wallBriqueNoireCraqueleeAngmar, (String)"wallBriqueNoireCraqueleeAngmar");
        verticalSlabBriqueNoireCraqueleeAngmar = new VerticalSlab(briqueCraqueleeAngmar, "verticalSlabBriqueNoireCraqueleeAngmar");
        GameRegistry.registerBlock((Block)verticalSlabBriqueNoireCraqueleeAngmar, (String)"verticalSlabBriqueNoireCraqueleeAngmar");
        
        briqueNoireMoussueAngmar = new MossyRock("stoneBrickMossy", "modsda:stoneBrickMossy");
        GameRegistry.registerBlock((Block)briqueNoireMoussueAngmar, (String)"stoneBrickMossy");
        stairBriqueNoireMoussueAngmar = new Stair(briqueNoireMoussueAngmar, "stairStoneBrickMossy");
        GameRegistry.registerBlock((Block)stairBriqueNoireMoussueAngmar, (String)"stairStoneBrickMossy");
        slabBriqueNoireMoussueAngmar = new Slab(briqueNoireMoussueAngmar, "slabBriqueNoireMoussueAngmar", false);
        doubleSlabBriqueNoireMoussueAngmar = new Slab(briqueNoireMoussueAngmar, "doubleSlabBriqueNoireMoussueAngmar", true);
        GameRegistry.registerBlock((Block)slabBriqueNoireMoussueAngmar, (Class)ItemDalle.class, (String)"slabBriqueNoireMoussueAngmar");
        GameRegistry.registerBlock((Block)doubleSlabBriqueNoireMoussueAngmar, (Class)ItemDalle.class, (String)"doubleSlabBriqueNoireMoussueAngmar");
        wallBriqueNoireMoussueAngmar = new Wall(briqueNoireMoussueAngmar, "wallBriqueNoireMoussueAngmar");
        GameRegistry.registerBlock((Block)wallBriqueNoireMoussueAngmar, (String)"wallBriqueNoireMoussueAngmar");
        verticalSlabBriqueNoireMoussueAngmar = new VerticalSlab(briqueNoireMoussueAngmar, "verticalSlabBriqueNoireMoussueAngmar");
        GameRegistry.registerBlock((Block)verticalSlabBriqueNoireMoussueAngmar, (String)"verticalSlabBriqueNoireMoussueAngmar");
        
        briqueNoireAngmar2 = new Rock("stoneBrickSmooth", "modsda:stoneBrickSmooth");
        GameRegistry.registerBlock((Block)briqueNoireAngmar2, (String)"stoneBrickSmooth");
        stairBriqueNoireAngmar2 = new Stair(briqueNoireAngmar2, "stairStoneBrickSmooth");
        GameRegistry.registerBlock((Block)stairBriqueNoireAngmar2, (String)"stairStoneBrickSmooth");
        slabBriqueNoireAngmar2 = new Slab(briqueNoireAngmar2, "slabBriqueNoireAngmar2", false);
        doubleSlabBriqueNoireAngmar2 = new Slab(briqueNoireAngmar2, "doubleSlabBriqueNoireAngmar2", true);
        GameRegistry.registerBlock((Block)slabBriqueNoireAngmar2, (Class)ItemDalle.class, (String)"slabBriqueNoireAngmar2");
        GameRegistry.registerBlock((Block)doubleSlabBriqueNoireAngmar2, (Class)ItemDalle.class, (String)"doubleSlabBriqueNoireAngmar2");
        wallBriqueNoireAngmar2 = new Wall(briqueNoireAngmar2, "wallBriqueNoireAngmar2");
        GameRegistry.registerBlock((Block)wallBriqueNoireAngmar2, (String)"wallBriqueNoireAngmar2");
        verticalSlabBriqueNoireAngmar2 = new VerticalSlab(briqueNoireAngmar2, "verticalSlabBriqueNoireAngmar2");
        GameRegistry.registerBlock((Block)verticalSlabBriqueNoireAngmar2, (String)"verticalSlabBriqueNoireAngmar2");
        
        briqueNoireMoussueAngmar2 = new MossyRock("stoneMoss", "modsda:stoneMoss");
        GameRegistry.registerBlock((Block)briqueNoireMoussueAngmar2, (String)"stoneMoss");
        stairBriqueNoireMoussueAngmar2 = new Stair(briqueNoireMoussueAngmar2, "stairStoneMoss");
        GameRegistry.registerBlock((Block)stairBriqueNoireMoussueAngmar2, (String)"stairStoneMoss");
        slabBriqueNoireMoussueAngmar2 = new Slab(stairBriqueNoireMoussueAngmar2, "slabBriqueNoireMoussueAngmar2", false);
        doubleSlabBriqueNoireMoussueAngmar2 = new Slab(stairBriqueNoireMoussueAngmar2, "doubleSlabBriqueNoireMoussueAngma2r", true);
        GameRegistry.registerBlock((Block)slabBriqueNoireMoussueAngmar2, (Class)ItemDalle.class, (String)"slabBriqueNoireMoussueAngmar2");
        GameRegistry.registerBlock((Block)doubleSlabBriqueNoireMoussueAngmar2, (Class)ItemDalle.class, (String)"doubleSlabBriqueNoireMoussueAngmar2");
        wallBriqueNoireMoussueAngmar2 = new Wall(briqueNoireMoussueAngmar2, "wallBriqueNoireMoussueAngmar2");
        GameRegistry.registerBlock((Block)wallBriqueNoireMoussueAngmar2, (String)"wallBriqueNoireMoussueAngmar2");
        verticalSlabBriqueNoireMoussueAngmar2 = new VerticalSlab(briqueNoireMoussueAngmar2, "verticalSlabBriqueNoireMoussueAngmar2");
        GameRegistry.registerBlock((Block)verticalSlabBriqueNoireMoussueAngmar2, (String)"verticalSlabBriqueNoireMoussueAngmar2");
        
        gresCiselleDore = new Rock("Orange Sandstone", "modsda:orange_sandstone");
        GameRegistry.registerBlock((Block)gresCiselleDore, (String)"Orange Sandstone");
        stairgresCiselleDore = new Stair(gresCiselleDore, "stairOrange_sandstone");
        GameRegistry.registerBlock((Block)stairgresCiselleDore, (String)"stairOrange_sandstone");
        slabGresCiselleDore = new Slab(gresCiselleDore, "slabGresCiselleDore", false);
        doubleSlabGresCiselleDore = new Slab(gresCiselleDore, "doubleSlabGresCiselleDore", true);
        GameRegistry.registerBlock((Block)slabGresCiselleDore, (Class)ItemDalle.class, (String)"slabGresCiselleDore");
        GameRegistry.registerBlock((Block)doubleSlabGresCiselleDore, (Class)ItemDalle.class, (String)"doubleSlabGresCiselleDore");
        wallGresCiselleDore = new Wall(gresCiselleDore, "wallGresCiselleDore");
        GameRegistry.registerBlock((Block)wallGresCiselleDore, (String)"wallGresCiselleDore");
        verticalSlabGresCiselleDore = new VerticalSlab(gresCiselleDore, "verticalSlabGresCiselleDore");
        GameRegistry.registerBlock((Block)verticalSlabGresCiselleDore, (String)"verticalSlabGresCiselleDore");
        
        briqueGresDore = new Rock("Orange Sandstone Normal", "modsda:orange_sandstone_normal");
        GameRegistry.registerBlock((Block)briqueGresDore, (String)"Orange Sandstone Normal");
        stairBriqueGresDore = new Stair(briqueGresDore, "stairOrange_sandstone_normal");
        GameRegistry.registerBlock((Block)stairBriqueGresDore, (String)"stairOrange_sandstone_normal");
        slabBriqueGresDore = new Slab(briqueGresDore, "slabBriqueGresDore", false);
        doubleSlabBriqueGresDore = new Slab(briqueGresDore, "doubleSlabBriqueGresDore", true);
        GameRegistry.registerBlock((Block)slabBriqueGresDore, (Class)ItemDalle.class, (String)"slabBriqueGresDore");
        GameRegistry.registerBlock((Block)doubleSlabBriqueGresDore, (Class)ItemDalle.class, (String)"doubleSlabBriqueGresDore");
        wallBriqueGresDore = new Wall(briqueGresDore, "wallBriqueGresDore");
        GameRegistry.registerBlock((Block)wallBriqueGresDore, (String)"wallBriqueGresDore");
        verticalSlabBriqueGresDore = new VerticalSlab(briqueGresDore, "verticalSlabBriqueGresDore");
        GameRegistry.registerBlock((Block)verticalSlabBriqueGresDore, (String)"verticalSlabBriqueGresDore");
        
        blueStone = new Rock("obsidian2", "modsda:obsidian2");
        GameRegistry.registerBlock((Block)blueStone, (String)"obsidian2");
        stairBlueStone = new Stair(blueStone, "stairBlueStone");
        GameRegistry.registerBlock((Block)stairBlueStone, (String)"stairBlueStone");
        slabBlueStone = new Slab(blueStone, "slabRocheBleue", false);
        doubleSlabBlueStone = new Slab(blueStone, "doubleSlabRocheBleue", true);
        GameRegistry.registerBlock((Block)slabBlueStone, (Class)ItemDalle.class, (String)"slabRocheBleue");
        GameRegistry.registerBlock((Block)doubleSlabBlueStone, (Class)ItemDalle.class, (String)"doubleSlabRocheBleue");
        wallBlueStone = new Wall(blueStone, "wallRocheBleue");
        GameRegistry.registerBlock((Block)wallBlueStone, (String)"wallRocheBleue");
        verticalSlabBlueStone = new VerticalSlab(blueStone, "verticalSlabBlueStone");
        GameRegistry.registerBlock((Block)verticalSlabBlueStone, (String)"verticalSlabBlueStone");
        
        stoneBrickBis = new Rock("StoneBrickBis", "modsda:stonebrickbis");
        GameRegistry.registerBlock((Block)stoneBrickBis, (String)"StoneBrickBis");
        stairStoneBrickBis = new Stair(stoneBrickBis, "stairStoneBrickBis");
        GameRegistry.registerBlock((Block)stairStoneBrickBis, (String)"stairStoneBrickBis");
        
        blackStone = new Rock("blocnoir", "modsda:b_blocnoir");
        GameRegistry.registerBlock((Block)blackStone, (String)"blocnoir");
        stairBlackStone = new Stair(blackStone, "stairBlackStone");
        GameRegistry.registerBlock((Block)stairBlackStone, (String)"stairBlackStone");
        
        blackStone = new Rock("blocnoir2", "modsda:blocnoir2");
        GameRegistry.registerBlock((Block)blackStone, (String)"blocnoir2");
        stairBlackStone = new Stair(blackStone, "stairDarkDarkGrayStone");
        GameRegistry.registerBlock((Block)stairBlackStone, (String)"stairDarkDarkGrayStone");
        slabBlackStone = new Slab(blackStone, "slabRocheNoire", false);
        doubleSlabBlackStone = new Slab(blackStone, "doubleSlabRocheBleue", true);
        GameRegistry.registerBlock((Block)slabBlackStone, (Class)ItemDalle.class, (String)"slabRocheNoire");
        GameRegistry.registerBlock((Block)doubleSlabBlackStone, (Class)ItemDalle.class, (String)"doubleSlabRocheNoire");
        wallBlackStone = new Wall(blackStone, "wallRocheNoire");
        GameRegistry.registerBlock((Block)wallBlackStone, (String)"wallRocheNoire");
        verticalSlabBlackStone = new VerticalSlab(blackStone, "verticalSlabBlackStone");
        GameRegistry.registerBlock((Block)verticalSlabBlackStone, (String)"verticalSlabBlackStone");
       
        darkGrayStone = new Rock("stonedark", "modsda:b_stonedark");
        GameRegistry.registerBlock((Block)darkGrayStone, (String)"stonedark");
        stairDarkGrayStone = new Stair(darkGrayStone, "escalierstonedark");
        GameRegistry.registerBlock((Block)stairDarkGrayStone, (String)"escalierstonedark");
        slabDarkGrayStone = new Slab(darkGrayStone, "slabRocheGriseFonce", false);
        doubleSlabDarkGrayStone = new Slab(darkGrayStone, "doubleSlabRocheGriseFonce", true);
        GameRegistry.registerBlock((Block)slabDarkGrayStone, (Class)ItemDalle.class, (String)"slabRocheGriseFonce");
        GameRegistry.registerBlock((Block)doubleSlabDarkGrayStone, (Class)ItemDalle.class, (String)"doubleSlabRocheGriseFonce");
        wallDarkGrayStone = new Wall(darkGrayStone, "wallRocheGriseFonce");
        GameRegistry.registerBlock((Block)wallDarkGrayStone, (String)"wallRocheGriseFonce");
        verticalSlabDarkGrayStone = new VerticalSlab(darkGrayStone, "verticalSlabDarkGrayStone");
        GameRegistry.registerBlock((Block)verticalSlabDarkGrayStone, (String)"verticalSlabDarkGrayStone");
        
        grayStone = new Rock("stonegrey", "modsda:b_stonegrey");
        GameRegistry.registerBlock((Block)grayStone, (String)"stonegrey");
        stairGrayStone = new Stair(grayStone, "escalierstonegrey");
        GameRegistry.registerBlock((Block)stairGrayStone, (String)"escalierstonegrey");
        slabGrayStone = new Slab(grayStone, "slabRocheGrise", false);
        doubleSlabGrayStone = new Slab(grayStone, "doubleSlabRocheGrise", true);
        GameRegistry.registerBlock((Block)slabGrayStone, (Class)ItemDalle.class, (String)"slabRocheGrise");
        GameRegistry.registerBlock((Block)doubleSlabGrayStone, (Class)ItemDalle.class, (String)"doubleSlabRocheGrise");
        wallGrayStone = new Wall(grayStone, "wallRocheGrise");
        GameRegistry.registerBlock((Block)wallGrayStone, (String)"wallRocheGrise");
        verticalSlabGrayStone = new VerticalSlab(grayStone, "verticalSlabGrayStone");
        GameRegistry.registerBlock((Block)verticalSlabGrayStone, (String)"verticalSlabGrayStone");
        
        whiteStone = new Rock("stonewhite", "modsda:b_stonewhite");
        GameRegistry.registerBlock((Block)whiteStone, (String)"stonewhite");
        escalierWhiteStone = new Stair(whiteStone, "escalierstonewhite");
        GameRegistry.registerBlock((Block)escalierWhiteStone, (String)"escalierstonewhite");
        slabWhiteStone = new Slab(whiteStone, "slabRocheBlanche", false);
        doubleSlabWhiteStone = new Slab(whiteStone, "doubleSlabRocheBlanche", true);
        GameRegistry.registerBlock((Block)slabWhiteStone, (Class)ItemDalle.class, (String)"slabRocheBlanche");
        GameRegistry.registerBlock((Block)doubleSlabWhiteStone, (Class)ItemDalle.class, (String)"doubleSlabRocheBlanche");
        wallWhiteStone = new Wall(whiteStone, "wallRocheBlanche");
        GameRegistry.registerBlock((Block)wallWhiteStone, (String)"wallRocheBlanche");
        verticalSlabWhiteStone = new VerticalSlab(whiteStone, "verticalSlabWhiteStone");
        GameRegistry.registerBlock((Block)verticalSlabWhiteStone, (String)"verticalSlabWhiteStone");
        
        daleStone = new Rock("roche_dale", "modsda:b_rochedale");
        GameRegistry.registerBlock((Block)daleStone, (String)"roche_dale");
        escalierDaleStone = new Stair(daleStone, "escalierdale");
        GameRegistry.registerBlock((Block)escalierDaleStone, (String)"escalier_rochedale");
        slabDaleStone = new Slab(daleStone, "slabRocheDale", false);
        doubleSlabDaleStone = new Slab(daleStone, "doubleSlabRocheDale", true);
        GameRegistry.registerBlock((Block)slabDaleStone, (Class)ItemDalle.class, (String)"slabRocheDale");
        GameRegistry.registerBlock((Block)doubleSlabDaleStone, (Class)ItemDalle.class, (String)"doubleSlabRocheDale");
        wallDaleStone = new Wall(daleStone, "wallRocheDale");
        GameRegistry.registerBlock((Block)wallDaleStone, (String)"wallRocheDale");
        verticalSlabDaleStone = new VerticalSlab(daleStone, "verticalSlabDaleStone");
        GameRegistry.registerBlock((Block)verticalSlabDaleStone, (String)"verticalSlabDaleStone");
        
        paveCarnDum = new Rock("obsidian", "modsda:b_obsidian");
        GameRegistry.registerBlock((Block)paveCarnDum, (String)"obsidian");
        stairPaveCarnDum = new Stair(paveCarnDum, "stairPaveCarnDum");
        GameRegistry.registerBlock((Block)stairPaveCarnDum, (String)"stairPaveCarnDum");
        slabPaveCarnDum = new Slab(paveCarnDum, "slabPaveCarnDum", false);
        doubleSlabPaveCarnDum = new Slab(paveCarnDum, "doubleSlabPaveCarnDum", true);
        GameRegistry.registerBlock((Block)slabPaveCarnDum, (Class)ItemDalle.class, (String)"slabPaveCarnDum");
        GameRegistry.registerBlock((Block)doubleSlabPaveCarnDum, (Class)ItemDalle.class, (String)"doubleSlabPaveCarnDum");
        wallPaveCarnDum = new Wall(paveCarnDum, "wallPaveCarnDum");
        GameRegistry.registerBlock((Block)wallPaveCarnDum, (String)"wallPaveCarnDum");
        verticalSlabPaveCarnDum = new VerticalSlab(paveCarnDum, "verticalSlabPaveCarnDum");
        GameRegistry.registerBlock((Block)verticalSlabPaveCarnDum, (String)"verticalSlabPaveCarnDum");
        
        netherrack = new Rock("Netherrack", "modsda:netherrack");
        GameRegistry.registerBlock((Block)netherrack, (String)"netherrack");
        stairNetherrack = new Stair(netherrack, "stairNetherrack");
        GameRegistry.registerBlock((Block)stairNetherrack, (String)"stairNetherrack");
        
        braise = new Rock("braise2", "modsda:braise2");
        GameRegistry.registerBlock((Block)braise, (String)"braise2");
        
        brownBrick = new Rock("nether_brick", "modsda:nether_brick");
        GameRegistry.registerBlock((Block)brownBrick, (String)"nether_brick");
        stairBrownBrick = new Stair(brownBrick, "stairNether_brick");
        GameRegistry.registerBlock((Block)stairBrownBrick, (String)"stairNether_brick");
        slabBrownBrick = new Slab(brownBrick, "slabBriquesMarrons", false);
        doubleSlabBrownBrick = new Slab(brownBrick, "doubleSlabBriquesMarrons", true);
        GameRegistry.registerBlock((Block)slabBrownBrick, (Class)ItemDalle.class, (String)"slabBriquesMarrons");
        GameRegistry.registerBlock((Block)doubleSlabBrownBrick, (Class)ItemDalle.class, (String)"doubleSlabBriquesMarrons");
        wallBrownBrick = new Wall(brownBrick, "wallBriquesMarrons");
        GameRegistry.registerBlock((Block)wallBrownBrick, (String)"wallBriquesMarrons");
        verticalSlabBrownBrick = new VerticalSlab(brownBrick, "verticalSlabBrownBrick");
        GameRegistry.registerBlock((Block)verticalSlabBrownBrick, (String)"verticalSlabBrownBrick");
        
        briqueGresFonce = new Rock("sandbrick2", "modsda:sandbrick2");
        GameRegistry.registerBlock((Block)briqueGresFonce, (String)"sandbrick2");
        stairBriqueGresFonce = new Stair(briqueGresFonce, "escaliergres");
        GameRegistry.registerBlock((Block)stairBriqueGresFonce, (String)"escaliergres");
        slabBriqueGresFonce = new Slab(briqueGresFonce, "slabBriqueGresFoncee", false);
        doubleSlabBriqueGresFonce = new Slab(briqueGresFonce, "doubleSlabBriqueGresFoncee", true);
        GameRegistry.registerBlock((Block)slabBriqueGresFonce, (Class)ItemDalle.class, (String)"slabBriqueGresFoncee");
        GameRegistry.registerBlock((Block)doubleSlabBriqueGresFonce, (Class)ItemDalle.class, (String)"doubleSlabBriqueGresFoncee");
        wallBriqueGresFonce = new Wall(briqueGresFonce, "wallBriqueGresFoncee");
        GameRegistry.registerBlock((Block)wallBriqueGresFonce, (String)"wallBriqueGresFoncee");
        verticalSlabBriqueGresFonce = new VerticalSlab(briqueGresFonce, "verticalSlabBriqueGresFonce");
        GameRegistry.registerBlock((Block)verticalSlabBriqueGresFonce, (String)"verticalSlabBriqueGresFonce");
        
        briqueGresSculpte = new Rock("sandbrick3", "modsda:sandbrick3");
        GameRegistry.registerBlock((Block)briqueGresSculpte, (String)"sandbrick3");
        stairBriqueGresSculpte = new Stair(briqueGresSculpte, "escaliergres2");
        GameRegistry.registerBlock((Block)stairBriqueGresSculpte, (String)"escaliergres2");
        slabBriqueGresSculpte = new Slab(briqueGresSculpte, "slabBriqueGresSculpte", false);
        doubleSlabBriqueGresSculpte = new Slab(briqueGresSculpte, "doubleSlabBriqueGresSculpte", true);
        GameRegistry.registerBlock((Block)slabBriqueGresSculpte, (Class)ItemDalle.class, (String)"slabBriqueGresSculpte");
        GameRegistry.registerBlock((Block)doubleSlabBriqueGresSculpte, (Class)ItemDalle.class, (String)"doubleSlabBriqueGresSculpte");
        wallBriqueGresSculpte = new Wall(briqueGresSculpte, "wallBriqueGresSculpte");
        GameRegistry.registerBlock((Block)wallBriqueGresSculpte, (String)"wallBriqueGresSculpte");
        verticalSlabBriqueGresSculpte = new VerticalSlab(briqueGresSculpte, "verticalSlabBriqueGresSculpte");
        GameRegistry.registerBlock((Block)verticalSlabBriqueGresSculpte, (String)"verticalSlabBriqueGresSculpte");
        
        briqueGresTaille = new Rock("pavesand", "modsda:pavesand");
        GameRegistry.registerBlock((Block)briqueGresTaille, (String)"pavesand");
        stairBriqueGresTaille = new Stair(briqueGresTaille, "escaliergres3");
        GameRegistry.registerBlock((Block)stairBriqueGresTaille, (String)"escaliergres3");
        slabBriqueGresTaille = new Slab(briqueGresTaille, "slabBriqueGresTaille", false);
        doubleSlabBriqueGresTaille = new Slab(briqueGresTaille, "doubleSlabBriqueGresTaille", true);
        GameRegistry.registerBlock((Block)slabBriqueGresTaille, (Class)ItemDalle.class, (String)"slabBriqueGresTaille");
        GameRegistry.registerBlock((Block)doubleSlabBriqueGresTaille, (Class)ItemDalle.class, (String)"doubleSlabBriqueGresTaille");
        wallBriqueGresTaille = new Wall(briqueGresTaille, "muretBriqueGresTaille");
        GameRegistry.registerBlock((Block)wallBriqueGresTaille, (String)"muretBriqueGresTaille");
        verticalSlabBriqueGresTaille = new VerticalSlab(briqueGresTaille, "verticalSlabBriqueGresTaille");
        GameRegistry.registerBlock((Block)verticalSlabBriqueGresTaille, (String)"verticalSlabBriqueGresTaille");
        
        briqueRocheGriseTaillee = new Rock("pave5", "modsda:pave5");
        GameRegistry.registerBlock((Block)briqueRocheGriseTaillee, (String)"pave5");
        stairBriqueRochGriseTaillee = new Stair(briqueRocheGriseTaillee, "escalierpave5");
        GameRegistry.registerBlock((Block)stairBriqueRochGriseTaillee, (String)"escalierpave5");
        slabBriqueRocheGriseTaillee = new Slab(briqueRocheGriseTaillee, "slabBriqueRocheGriseTaillee", false);
        doubleSlabBriqueRocheGriseTaillee = new Slab(briqueRocheGriseTaillee, "doubleSlabBriqueRocheGriseTaillee", true);
        GameRegistry.registerBlock((Block)slabBriqueRocheGriseTaillee, (Class)ItemDalle.class, (String)"slabBriqueRocheGriseTaillee");
        GameRegistry.registerBlock((Block)doubleSlabBriqueRocheGriseTaillee, (Class)ItemDalle.class, (String)"doubleSlabBriqueRocheGriseTaillee");
        wallBriqueRocheGriseTaillee = new Wall(briqueRocheGriseTaillee, "wallBriqueRocheGriseTaillee");
        GameRegistry.registerBlock((Block)wallBriqueRocheGriseTaillee, (String)"wallBriqueRocheGriseTaillee");
        verticalSlabBriqueRocheGriseTaillee = new VerticalSlab(briqueRocheGriseTaillee, "verticalSlabBriqueRocheGriseTaillee");
        GameRegistry.registerBlock((Block)verticalSlabBriqueRocheGriseTaillee, (String)"verticalSlabBriqueRocheGriseTaillee");
        
        grosseBriqueGresTaille = new Rock("pave3", "modsda:b_pave3");
        GameRegistry.registerBlock((Block)grosseBriqueGresTaille, (String)"pave3");
        stairsGrosseBriqueGresTaille = new Stair(grosseBriqueGresTaille, "stairPave3");
        GameRegistry.registerBlock((Block)stairsGrosseBriqueGresTaille, (String)"stairPave3");
        slabGrosseBriqueGresTaille = new Slab(grosseBriqueGresTaille, "slabGrosseBriqueGresTaille", false);
        doubleSlabGrosseBriqueGresTaille = new Slab(grosseBriqueGresTaille, "doubleSlabGrosseBriqueGresTaille", true);
        GameRegistry.registerBlock((Block)slabGrosseBriqueGresTaille, (Class)ItemDalle.class, (String)"slabGrosseBriqueGresTaille");
        GameRegistry.registerBlock((Block)doubleSlabGrosseBriqueGresTaille, (Class)ItemDalle.class, (String)"doubleSlabGrosseBriqueGresTaille");
        wallGrosseBriqueGresTaille = new Wall(grosseBriqueGresTaille, "muretGrosseBriqueGresTaille");
        GameRegistry.registerBlock((Block)wallGrosseBriqueGresTaille, (String)"muretGrosseBriqueGresTaille");
        verticalSlabGrosseBriqueGresTaille = new VerticalSlab(briqueRocheGriseTaillee, "verticalSlabGrosseBriqueGresTaille");
        GameRegistry.registerBlock((Block)verticalSlabGrosseBriqueGresTaille, (String)"verticalSlabGrosseBriqueGresTaille");
        
        gresCiselle = new Rock("pave4", "modsda:b_pave4");
        GameRegistry.registerBlock((Block)gresCiselle, (String)"pave4");
        stairGresCiselle = new Stair(gresCiselle, "stairPave4");
        GameRegistry.registerBlock((Block)stairGresCiselle, (String)"stairPave4");
        slabGresCiselle = new Slab(gresCiselle, "slabGresCiselle", false);
        doubleSlabGresCiselle = new Slab(gresCiselle, "doubleSlabGresCiselle", true);
        GameRegistry.registerBlock((Block)slabGresCiselle, (Class)ItemDalle.class, (String)"slabGresCiselle");
        GameRegistry.registerBlock((Block)doubleSlabGresCiselle, (Class)ItemDalle.class, (String)"doubleSlabGresCiselle");
        wallGresCiselle = new Wall(gresCiselle, "wallGresCiselle");
        GameRegistry.registerBlock((Block)wallGresCiselle, (String)"wallGresCiselle");
        verticalSlabGresCiselle = new VerticalSlab(gresCiselle, "verticalSlabGresCiselle");
        GameRegistry.registerBlock((Block)verticalSlabGresCiselle, (String)"verticalSlabGresCiselle");
       
        darkStoneTaille = new Rock("stonebrickdark2", "modsda:b_stonebrickdark2");
        GameRegistry.registerBlock((Block)darkStoneTaille, (String)"stonebrickdark2");
        stairsDarkStoneTaille = new Stair(darkStoneTaille, "escalierbrickdark2");
        GameRegistry.registerBlock((Block)stairsDarkStoneTaille, (String)"escalierbrickdark2");
        slabDarkStoneTaille = new Slab(darkStoneTaille, "slabPierretailleefoncee", false);
        doubleSlabDarkStoneTaille = new Slab(darkStoneTaille, "doubleSlabPierretailleefoncee", true);
        GameRegistry.registerBlock((Block)slabDarkStoneTaille, (Class)ItemDalle.class, (String)"slabPierretailleefoncee");
        GameRegistry.registerBlock((Block)doubleSlabDarkStoneTaille, (Class)ItemDalle.class, (String)"doubleSlabPierretailleefoncee");
        wallDarkStoneTaille = new Wall(darkStoneTaille, "wallPierretailleefoncee");
        GameRegistry.registerBlock((Block)wallDarkStoneTaille, (String)"wallPierretailleefoncee");
        verticalSlabDarkStoneTaille = new VerticalSlab(darkStoneTaille, "verticalSlabDarkStoneTaille");
        GameRegistry.registerBlock((Block)verticalSlabDarkStoneTaille, (String)"verticalSlabDarkStoneTaille");
        
        cobblestoneDale = new Rock("pierre_dale", "modsda:b_pierredale");
        GameRegistry.registerBlock((Block)cobblestoneDale, (String)"pierre_dale");
        stairCobblestoneDale = new Stair(cobblestoneDale, "stairBlocksda2");
        GameRegistry.registerBlock((Block)stairCobblestoneDale, (String)"stairBlocksda2");
        slabCobblestoneDale = new Slab(cobblestoneDale, "slabPierreDeDale", false);
        doubleSlabCobblestoneDale = new Slab(cobblestoneDale, "doubleSlabPierreDeDale", true);
        GameRegistry.registerBlock((Block)slabCobblestoneDale, (Class)ItemDalle.class, (String)"slabPierreDeDale");
        GameRegistry.registerBlock((Block)doubleSlabCobblestoneDale, (Class)ItemDalle.class, (String)"doubleSlabPierreDeDale");
        wallCobblestoneDale = new Wall(cobblestoneDale, "wallPierreDeDale");
        GameRegistry.registerBlock((Block)wallCobblestoneDale, (String)"wallPierreDeDale");
        verticalSlabCobblestoneDale = new VerticalSlab(cobblestoneDale, "verticalSlabCobblestoneDale");
        GameRegistry.registerBlock((Block)verticalSlabCobblestoneDale, (String)"verticalSlabCobblestoneDale");
        
        pierreTailleeSombre = new Rock("pave", "modsda:b_pave");
        GameRegistry.registerBlock((Block)pierreTailleeSombre, (String)"pave");
        stairPierreTailleeSombre = new Stair(pierreTailleeSombre, "stairBlocksda6");
        GameRegistry.registerBlock((Block)stairPierreTailleeSombre, (String)"stairBlocksda6");
        slabPierreTailleeSombre = new Slab(pierreTailleeSombre, "slabPierreTailleeSombre", false);
        doubleSlabPierreTailleeSombre = new Slab(pierreTailleeSombre, "doubleSlabPierreTailleeSombre", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeSombre, (Class)ItemDalle.class, (String)"slabPierreTailleeSombre");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeSombre, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeSombre");
        wallPierreTailleeSombre = new Wall(pierreTailleeSombre, "wallPierreTailleeSombre");
        GameRegistry.registerBlock((Block)wallPierreTailleeSombre, (String)"wallPierreTailleeSombre");
        verticalSlabPierreTailleeSombre = new VerticalSlab(cobblestoneDale, "verticalSlabPierreTailleeSombre");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeSombre, (String)"verticalSlabPierreTailleeSombre");
        
        pave = new Rock("pave2", "modsda:b_pave2");
        GameRegistry.registerBlock((Block)pave, (String)"pave2");
        stairPave = new Stair(pave, "stairBlocksda7");
        GameRegistry.registerBlock((Block)stairPave, (String)"stairBlocksda7");
        slabPave = new Slab(pave, "slabPave", false);
        doubleSlabPave = new Slab(pave, "doubleSlabPave", true);
        GameRegistry.registerBlock((Block)slabPave, (Class)ItemDalle.class, (String)"slabPave");
        GameRegistry.registerBlock((Block)doubleSlabPave, (Class)ItemDalle.class, (String)"doubleSlabPave");
        wallPave = new Wall(pave, "wallPave");
        GameRegistry.registerBlock((Block)wallPave, (String)"wallPave");
        verticalSlabPave = new VerticalSlab(pave, "verticalSlabPave");
        GameRegistry.registerBlock((Block)verticalSlabPave, (String)"verticalSlabPave");
       
        pierreTailleeDale = new Rock("brique_dale", "modsda:b_briquedale");
        GameRegistry.registerBlock((Block)pierreTailleeDale, (String)"brique_dale");
        stairPierreTailleeDale = new Stair(pierreTailleeDale, "escalierbriquedale");
        GameRegistry.registerBlock((Block)stairPierreTailleeDale, (String)"escalier_briquedale");
        slabPierreTailleeDale = new Slab(pierreTailleeDale, "slabPierreTailleeDale", false);
        doubleSlabPierreTailleeDale = new Slab(pierreTailleeDale, "doubleSlabPave", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeDale, (Class)ItemDalle.class, (String)"slabPierreTailleeDale");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeDale, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeDale");
        wallPierreTailleeDale = new Wall(pierreTailleeDale, "wallPierreTailleeDale");
        GameRegistry.registerBlock((Block)wallPierreTailleeDale, (String)"wallPierreTailleeDale");
        verticalSlabPierreTailleeDale = new VerticalSlab(pierreTailleeDale, "verticalSlabPierreTailleeDale");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeDale, (String)"verticalSlabPierreTailleeDale");
        
        stonebrickcrackwhite = new Rock("stonebrickcrackwhite", "modsda:b_stonebrick_crackedwhite");
        GameRegistry.registerBlock((Block)stonebrickcrackwhite, (String)"stonebrickcrackwhite");
        stairStonebrickCrackedWhite = new Stair(stonebrickcrackwhite, "escaliercrackbrickwhite");
        GameRegistry.registerBlock((Block)stairStonebrickCrackedWhite, (String)"escaliercrackbrickwhite");
        slabPierreTailleeBlancheCisellee = new Slab(stonebrickcrackwhite, "slabPierreTailleeBlancheCisellee", false);
        doubleSlabPierreTailleeBlancheCisellee = new Slab(stonebrickcrackwhite, "doubleSlabPierreTailleeBlancheCisellee", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeBlancheCisellee, (Class)ItemDalle.class, (String)"slabPierreTailleeBlancheCisellee");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeBlancheCisellee, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeBlancheCisellee");
        wallPierreTailleeBlancheCisellee = new Wall(stonebrickcrackwhite, "wallPierreTailleeBlancheCisellee");
        GameRegistry.registerBlock((Block)wallPierreTailleeBlancheCisellee, (String)"wallPierreTailleeBlancheCisellee");
        verticalSlabPierreTailleeBlancheCisellee = new VerticalSlab(stonebrickcrackwhite, "verticalSlabPierreTailleeBlancheCisellee");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeBlancheCisellee, (String)"verticalSlabPierreTailleeBlancheCisellee");
       
        stonebrickcrackgrey = new Rock("stonebrickcrackgrey", "modsda:b_stonebrick_crackedgrey");
        GameRegistry.registerBlock((Block)stonebrickcrackgrey, (String)"stonebrickcrackgrey");
        stairStonebrickCrackedGrey = new Stair(stonebrickcrackgrey, "escaliercrackbrickgrey");
        GameRegistry.registerBlock((Block)stairStonebrickCrackedGrey, (String)"escaliercrackbrickgrey");
        slabPierreTailleeGriseCisellee = new Slab(stonebrickcrackgrey, "slabPierreTailleeGriseCisellee", false);
        doubleSlabPierreTailleeGriseCisellee = new Slab(stonebrickcrackgrey, "doubleSlabPierreTailleeBlancheCisellee", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeGriseCisellee, (Class)ItemDalle.class, (String)"slabPierreTailleeGriseCisellee");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeGriseCisellee, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeGriseCisellee");
        wallPierreTailleeGriseCisellee = new Wall(stonebrickcrackgrey, "wallPierreTailleeGriseCisellee");
        GameRegistry.registerBlock((Block)wallPierreTailleeGriseCisellee, (String)"wallPierreTailleeGriseCisellee");
        verticalSlabPierreTailleeGriseCisellee = new VerticalSlab(stonebrickcrackgrey, "verticalSlabPierreTailleeGriseCisellee");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeGriseCisellee, (String)"verticalSlabPierreTailleeGriseCisellee");
        
        stonebrickcrackdark = new Rock("stonebrickcrackdark", "modsda:b_stonebrick_crackeddark");
        GameRegistry.registerBlock((Block)stonebrickcrackdark, (String)"stonebrickcrackdark");
        stairStonebrickCrackedDark = new Stair(stonebrickcrackdark, "escaliercrackbrickdark");
        GameRegistry.registerBlock((Block)stairStonebrickCrackedDark, (String)"escaliercrackbrickdark");
        slabPierreTailleeFonceeCisellee = new Slab(stonebrickcrackdark, "slabPierreTailleeFonceeCisellee", false);
        doubleSlabPierreTailleeFonceeCisellee = new Slab(stonebrickcrackdark, "doubleSlabPierreTailleeFonceeCisellee", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeFonceeCisellee, (Class)ItemDalle.class, (String)"slabPierreTailleeFonceeCisellee");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeFonceeCisellee, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeFonceeCisellee");
        wallPierreTailleeFonceeCisellee = new Wall(stonebrickcrackdark, "wallPierreTailleeFonceeCisellee");
        GameRegistry.registerBlock((Block)wallPierreTailleeFonceeCisellee, (String)"wallPierreTailleeFonceeCisellee");
        verticalSlabPierreTailleeFonceeCisellee = new VerticalSlab(stonebrickcrackdark, "verticalSlabPierreTailleeFonceeCisellee");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeFonceeCisellee, (String)"verticalSlabPierreTailleeFonceeCisellee");
        
        stonebrickWhite = new Rock("stonebrickwhite", "modsda:b_stonebrickwhite");
        GameRegistry.registerBlock((Block)stonebrickWhite, (String)"stonebrickwhite");
        stairStonebrickWhite = new Stair(stonebrickWhite, "escalierbrickwhite", 0);
        GameRegistry.registerBlock((Block)stairStonebrickWhite, (String)"escalierbrickwhite");
        slabPierreTailleeBlanche = new Slab(stonebrickWhite, "slabPierreTailleeBlanche", false);
        doubleSlabPierreTailleeBlanche = new Slab(stonebrickWhite, "doubleSlabPierreTailleeBlanche", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeBlanche, (Class)ItemDalle.class, (String)"slabPierreTailleeBlanche");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeBlanche, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeBlanche");
        wallPierreTailleeBlanche = new Wall(stonebrickWhite, "wallPierreTailleeBlanche");
        GameRegistry.registerBlock((Block)wallPierreTailleeBlanche, (String)"wallPierreTailleeBlanche");
        verticalSlabPierreTailleeBlanche = new VerticalSlab(stonebrickWhite, "verticalSlabPierreTailleeBlanche");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeBlanche, (String)"verticalSlabPierreTailleeBlanche");
        
        stonebrickWhiteMossy = new MossyRock("stonebrickwhitemossy", "modsda:b_stonebrickwhite_mossy");
        GameRegistry.registerBlock((Block)stonebrickWhiteMossy, (String)"stonebrickwhitemossy");
        stairStonebrickWhiteMossy = new Stair(stonebrickWhiteMossy, "escalierbrickwhitemossy", 0);
        GameRegistry.registerBlock((Block)stairStonebrickWhiteMossy, (String)"escalierbrickwhitemossy");
        slabPierreTailleeBlancheMoussue = new Slab(stonebrickWhiteMossy, "slabPierreTailleeBlancheMoussue", false);
        doubleSlabPierreTailleeBlancheMoussue = new Slab(stonebrickWhiteMossy, "doubleSlabPierreTailleeBlancheMoussue", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeBlancheMoussue, (Class)ItemDalle.class, (String)"slabPierreTailleeBlancheMoussue");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeBlancheMoussue, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeBlancheMoussue");
        wallPierreTailleeBlancheMoussue = new Wall(stonebrickWhiteMossy, "wallPierreTailleeBlancheMoussue");
        GameRegistry.registerBlock((Block)wallPierreTailleeBlancheMoussue, (String)"wallPierreTailleeBlancheMoussue");
        verticalSlabPierreTailleeBlancheMoussue = new VerticalSlab(stonebrickWhiteMossy, "verticalSlabPierreTailleeBlancheMoussue");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeBlancheMoussue, (String)"verticalSlabPierreTailleeBlancheMoussue");
        
        stonebrickdark = new Rock("stonebrickdark", "modsda:b_stonebrickdark");
        GameRegistry.registerBlock((Block)stonebrickdark, (String)"stonebrickdark");
        stairStonebrickDark = new Stair(stonebrickdark, "escalierbrickdark");
        GameRegistry.registerBlock((Block)stairStonebrickDark, (String)"escalierbrickdark");
        slabPierreTailleeFoncee = new Slab(stonebrickdark, "slabPierreTailleeFoncee", false);
        doubleSlabPierreTailleeFoncee = new Slab(stonebrickdark, "doubleSlabPierreTailleeFoncee", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeFoncee, (Class)ItemDalle.class, (String)"slabPierreTailleeFoncee");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeFoncee, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeFoncee");
        wallPierreTailleeFoncee = new Wall(stonebrickdark, "wallPierreTailleeFoncee");
        GameRegistry.registerBlock((Block)wallPierreTailleeFoncee, (String)"wallPierreTailleeFoncee");
        verticalSlabPierreTailleeFoncee = new VerticalSlab(stonebrickdark, "verticalSlabPierreTailleeFoncee");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeFoncee, (String)"verticalSlabPierreTailleeFoncee");
        
        stonebrickDarkMossy = new MossyRock("stonebrickdarkmossy", "modsda:b_stonebrickdarkmossy");
        GameRegistry.registerBlock((Block)stonebrickDarkMossy, (String)"stonebrickdarkmossy");
        stairStonebrickDarkMossy = new Stair(stonebrickDarkMossy, "escalierbrickdarkmossy", 0);
        GameRegistry.registerBlock((Block)stairStonebrickDarkMossy, (String)"escalierbrickdarkmossy");
        slabPierreTailleeFonceeMoussue = new Slab(stonebrickDarkMossy, "slabPierreTailleeFonceeMoussue", false);
        doubleSlabPierreTailleeFonceeMoussue = new Slab(stonebrickDarkMossy, "doubleSlabPierreTailleeFonceeMoussue", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeFonceeMoussue, (Class)ItemDalle.class, (String)"slabPierreTailleeFonceeMoussue");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeFonceeMoussue, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeFonceeMoussue");
        wallPierreTailleeFonceeMoussue = new Wall(stonebrickDarkMossy, "wallPierreTailleeFonceeMoussue");
        GameRegistry.registerBlock((Block)wallPierreTailleeFonceeMoussue, (String)"wallPierreTailleeFonceeMoussue");
        verticalSlabPierreTailleeFonceeMoussue = new VerticalSlab(stonebrickDarkMossy, "verticalSlabPierreTailleeFonceeMoussue");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeFonceeMoussue, (String)"verticalSlabPierreTailleeFonceeMoussue");
        
        stonebrickgrey = new Rock("stonebrickgrey", "modsda:b_stonebrickgrey");
        GameRegistry.registerBlock((Block)stonebrickgrey, (String)"stonebrickgrey");
        stairStoneBrickGrey = new Stair(stonebrickgrey, "escalierbrickgrey");
        GameRegistry.registerBlock((Block)stairStoneBrickGrey, (String)"escalierbrickgrey");
        slabPierreTailleeGrise = new Slab(stonebrickgrey, "slabPierreTailleeGrise", false);
        doubleSlabPierreTailleeGrise = new Slab(stonebrickgrey, "doubleSlabPierreTailleeGrise", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeGrise, (Class)ItemDalle.class, (String)"slabPierreTailleeGrise");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeGrise, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeGrise");
        wallPierreTailleeGrise = new Wall(stonebrickgrey, "wallPierreTailleeGrise");
        GameRegistry.registerBlock((Block)wallPierreTailleeGrise, (String)"wallPierreTailleeGrise");
        verticalSlabPierreTailleeGrise = new VerticalSlab(stonebrickgrey, "verticalSlabPierreTailleeGrise");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeGrise, (String)"verticalSlabPierreTailleeGrise");
       
        stonebrickGreyMossy = new MossyRock("stonebrickgreymossy", "modsda:b_stonebrickgreymossy");
        GameRegistry.registerBlock((Block)stonebrickGreyMossy, (String)"stonebrickgreymossy");
        stairStonebrickGreyMossy = new Stair(stonebrickGreyMossy, "escalierbrickgreymossy", 0);
        GameRegistry.registerBlock((Block)stairStonebrickGreyMossy, (String)"escalierbrickgreymossy");
        slabPierreTailleeGriseMoussue = new Slab(stonebrickGreyMossy, "slabPierreTailleeGriseMoussue", false);
        doubleSlabPierreTailleeGriseMoussue = new Slab(stonebrickGreyMossy, "doubleSlabPierreTailleeGriseMoussue", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeGriseMoussue, (Class)ItemDalle.class, (String)"slabPierreTailleeGriseMoussue");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeGriseMoussue, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeGriseMoussue");
        wallPierreTailleeGriseMoussue = new Wall(stonebrickGreyMossy, "wallPierreTailleeGriseMoussue");
        GameRegistry.registerBlock((Block)wallPierreTailleeGriseMoussue, (String)"wallPierreTailleeGriseMoussue");
        verticalSlabPierreTailleeGriseMoussue = new VerticalSlab(stonebrickGreyMossy, "verticalSlabPierreTailleeGriseMoussue");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeGriseMoussue, (String)"verticalSlabPierreTailleeGriseMoussue");
       
        stonebrickDarkBisCracked = new MossyRock("stonebrickdarkbiscracked", "modsda:b_stonebrickdarkcracked2");
        GameRegistry.registerBlock((Block)stonebrickDarkBisCracked, (String)"stonebrickdarkbiscracked");
        stairStonebrickDarkBisCracked = new Stair(stonebrickDarkBisCracked, "escalierbrickdarkbiscracked", 0);
        GameRegistry.registerBlock((Block)stairStonebrickDarkBisCracked, (String)"escalierbrickdarkbiscracked");
        slabDarkBisCracked = new Slab(stonebrickDarkBisCracked, "slabDarkBisCracked", false);
        doubleSlabDarkBisCracked = new Slab(stonebrickDarkBisCracked, "doubleSlabDarkBisCracked", true);
        GameRegistry.registerBlock((Block)slabDarkBisCracked, (Class)ItemDalle.class, (String)"slabDarkBisCracked");
        GameRegistry.registerBlock((Block)doubleSlabDarkBisCracked, (Class)ItemDalle.class, (String)"doubleSlabDarkBisCracked");
        wallDarkBisCracked = new Wall(stonebrickDarkBisCracked, "wallDarkBisCracked");
        GameRegistry.registerBlock((Block)wallDarkBisCracked, (String)"wallDarkBisCracked");
        verticalSlabDarkBisCracked = new VerticalSlab(stonebrickDarkBisCracked, "verticalSlabDarkBisCracked");
        GameRegistry.registerBlock((Block)verticalSlabDarkBisCracked, (String)"verticalSlabDarkBisCracked");
       
        sandrune = new Rock("sandrune", "modsda:b_2");
        GameRegistry.registerBlock((Block)sandrune, (String)"sandrune");
       
        sandrune2 = new Rock("sandrune2", "modsda:b_3");
        GameRegistry.registerBlock((Block)sandrune2, (String)"sandrune2");
       
        sandrune3 = new Rock("sandrune3", "modsda:b_4");
        GameRegistry.registerBlock((Block)sandrune3, (String)"sandrune3");
        
        stoneBrickBlue = new Rock("pierrebleu", "modsda:b_pierrebleute");
        GameRegistry.registerBlock((Block)stoneBrickBlue, (String)"pierrebleu");
        stairStoneBrickBlue = new Stair(stoneBrickBlue, "stairStoneBrickBlue");
        GameRegistry.registerBlock((Block)stairStoneBrickBlue, (String)"stairStoneBrickBlue");
        slabPierreTailleeBleue = new Slab(stoneBrickBlue, "slabPierreTailleeBleue", false);
        doubleSlabPierreTailleeBleue = new Slab(stoneBrickBlue, "doubleSlabPierreTailleeBleue", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeBleue, (Class)ItemDalle.class, (String)"slabPierreTailleeBleue");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeBleue, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeBleue");
        wallPierreTailleeBleue = new Wall(stoneBrickBlue, "wallPierreTailleeBleue");
        GameRegistry.registerBlock((Block)wallPierreTailleeBleue, (String)"wallPierreTailleeBleue");
        verticalSlabPierreTailleeBleue = new VerticalSlab(stoneBrickBlue, "verticalSlabPierreTailleeBleue");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeBleue, (String)"verticalSlabPierreTailleeBleue");
        
        stoneBrickGreen = new Rock("pierreverte", "modsda:b_pierreverte");
        GameRegistry.registerBlock((Block)stoneBrickGreen, (String)"pierreverte");
        stairStoneBrickGreen = new Stair(stoneBrickGreen, "stairStoneBrickGreen");
        GameRegistry.registerBlock((Block)stairStoneBrickGreen, (String)"stairStoneBrickGreen");
        slabPierreTailleeVerte = new Slab(stoneBrickGreen, "slabPierreTailleeVerte", false);
        doubleSlabPierreTailleeVerte = new Slab(stoneBrickGreen, "doubleSlabPierreTailleeVerte", true);
        GameRegistry.registerBlock((Block)slabPierreTailleeVerte, (Class)ItemDalle.class, (String)"slabPierreTailleeVerte");
        GameRegistry.registerBlock((Block)doubleSlabPierreTailleeVerte, (Class)ItemDalle.class, (String)"doubleSlabPierreTailleeVerte");
        wallPierreTailleeVerte = new Wall(stoneBrickGreen, "wallPierreTailleeVerte");
        GameRegistry.registerBlock((Block)wallPierreTailleeVerte, (String)"wallPierreTailleeVerte");
        verticalSlabPierreTailleeVerte = new VerticalSlab(stoneBrickGreen, "verticalSlabPierreTailleeVerte");
        GameRegistry.registerBlock((Block)verticalSlabPierreTailleeVerte, (String)"verticalSlabPierreTailleeVerte");
        
        stairWoolWhite = new Stair(Blocks.wool, "stairWoolWhite", 0);
        GameRegistry.registerBlock((Block)stairWoolWhite, (String)"stairWoolWhite");
        slabWoolWhite = new Slab(Blocks.wool, "slabWoolWhite", false, 0);
        doubleSlabWoolWhite = new Slab(Blocks.wool, "doubleSlabWoolWhite", true, 0);
        GameRegistry.registerBlock((Block)slabWoolWhite, (String)"slabWoolWhite");
        GameRegistry.registerBlock((Block)doubleSlabWoolWhite, (String)"doubleSlabWoolWhite");
        verticalSlabWoolWhite = new VerticalSlab(Blocks.wool, "verticalSlabWoolWhite", 0);
        GameRegistry.registerBlock((Block)verticalSlabWoolWhite, (String)"verticalSlabWoolWhite");
        
        stairWoolOrange = new Stair(Blocks.wool, "stairWoolOrange", 1);
        GameRegistry.registerBlock((Block)stairWoolOrange, (String)"stairWoolOrange");
        slabWoolOrange = new Slab(Blocks.wool, "slabWoolOrange", false, 1);
        doubleSlabWoolOrange = new Slab(Blocks.wool, "doubleSlabWoolOrange", true, 1);
        GameRegistry.registerBlock((Block)slabWoolOrange, (String)"slabWoolOrange");
        GameRegistry.registerBlock((Block)doubleSlabWoolOrange, (String)"doubleSlabWoolOrange");
        verticalSlabWoolOrange = new VerticalSlab(Blocks.wool, "verticalSlabWoolOrange", 1);
        GameRegistry.registerBlock((Block)verticalSlabWoolOrange, (String)"verticalSlabWoolOrange");
        
        stairWoolMagenta = new Stair(Blocks.wool, "stairWoolMagenta", 2);
        GameRegistry.registerBlock((Block)stairWoolMagenta, (String)"stairWoolMagenta");
        slabWoolMagenta = new Slab(Blocks.wool, "slabWoolMagenta", false, 2);
        doubleSlabWoolMagenta = new Slab(Blocks.wool, "doubleSlabWoolMagenta", true, 2);
        GameRegistry.registerBlock((Block)slabWoolMagenta, (String)"slabWoolMagenta");
        GameRegistry.registerBlock((Block)doubleSlabWoolMagenta, (String)"doubleSlabWooMagenta");
        verticalSlabWoolMagenta = new VerticalSlab(Blocks.wool, "verticalSlabWoolMagenta", 2);
        GameRegistry.registerBlock((Block)verticalSlabWoolMagenta, (String)"verticalSlabWoolMagenta");
        
        stairWoolLightBlue = new Stair(Blocks.wool, "stairWoolLightBlue", 3);
        GameRegistry.registerBlock((Block)stairWoolLightBlue, (String)"stairWoolLightBlue");
        slabWoolLightBlue = new Slab(Blocks.wool, "slabWoolLightBlue", false, 3);
        doubleSlabWoolLightBlue = new Slab(Blocks.wool, "doubleSlabWoolLightBlue", true, 3);
        GameRegistry.registerBlock((Block)slabWoolLightBlue, (String)"slabWoolLightBlue");
        GameRegistry.registerBlock((Block)doubleSlabWoolLightBlue, (String)"doubleSlabWoolLightBlue");
        verticalSlabWoolLightBlue = new VerticalSlab(Blocks.wool, "verticalSlabWoolLightBlue", 3);
        GameRegistry.registerBlock((Block)verticalSlabWoolLightBlue, (String)"verticalSlabWoolLightBlue");
        
        stairWoolYellow = new Stair(Blocks.wool, "stairWoolYellow", 4);
        GameRegistry.registerBlock((Block)stairWoolYellow, (String)"stairWoolYellow");
        slabWoolYellow = new Slab(Blocks.wool, "slabWoolYellow", false, 4);
        doubleSlabWoolYellow = new Slab(Blocks.wool, "doubleSlabWoolYellow", true, 4);
        GameRegistry.registerBlock((Block)slabWoolYellow, (String)"slabWoolYellow");
        GameRegistry.registerBlock((Block)doubleSlabWoolYellow, (String)"doubleSlabWoolYellow");
        verticalSlabWoolYellow = new VerticalSlab(Blocks.wool, "verticalSlabWoolYellow", 4);
        GameRegistry.registerBlock((Block)verticalSlabWoolYellow, (String)"verticalSlabWoolYellow");
        
        stairWoolLightGreen = new Stair(Blocks.wool, "stairWoolLightGreen", 5);
        GameRegistry.registerBlock((Block)stairWoolLightGreen, (String)"stairWoolLightGreen");
        slabWoolLightGreen = new Slab(Blocks.wool, "slabWoolLightGreen", false, 5);
        doubleSlabWoolLightGreen = new Slab(Blocks.wool, "doubleSlabWoolLightGreen", true, 5);
        GameRegistry.registerBlock((Block)slabWoolLightGreen, (String)"slabWoolLightGreen");
        GameRegistry.registerBlock((Block)doubleSlabWoolLightGreen, (String)"doubleSlabWoolLightGreen");
        verticalSlabWoolLightGreen = new VerticalSlab(Blocks.wool, "verticalSlabWoolLightGreen", 5);
        GameRegistry.registerBlock((Block)verticalSlabWoolLightGreen, (String)"verticalSlabWoolLightGreen");
       
        stairWoolPink = new Stair(Blocks.wool, "stairWooPink", 6);
        GameRegistry.registerBlock((Block)stairWoolPink, (String)"stairWoolPink");
        slabWoolPink = new Slab(Blocks.wool, "slabWoolPink", false, 6);
        doubleSlabWoolPink = new Slab(Blocks.wool, "doubleSlabWoolPink", true, 6);
        GameRegistry.registerBlock((Block)slabWoolPink, (String)"slabWoolPink");
        GameRegistry.registerBlock((Block)doubleSlabWoolPink, (String)"doubleSlabWoolPink");
        verticalSlabWoolPink = new VerticalSlab(Blocks.wool, "verticalSlabWoolPink", 6);
        GameRegistry.registerBlock((Block)verticalSlabWoolPink, (String)"verticalSlabWoolPink");
        
        stairWoolGrey = new Stair(Blocks.wool, "stairWoolGrey", 7);
        GameRegistry.registerBlock((Block)stairWoolGrey, (String)"stairWoolGrey");
        slabWoolGrey = new Slab(Blocks.wool, "slabWoolGrey", false, 7);
        doubleSlabWoolGrey = new Slab(Blocks.wool, "doubleSlabWoolGrey", true, 7);
        GameRegistry.registerBlock((Block)slabWoolGrey, (String)"slabWoolGrey");
        GameRegistry.registerBlock((Block)doubleSlabWoolGrey, (String)"doubleSlabWoolGrey");
        verticalSlabWoolGrey = new VerticalSlab(Blocks.wool, "verticalSlabWoolGrey", 7);
        GameRegistry.registerBlock((Block)verticalSlabWoolGrey, (String)"verticalSlabWoolGrey");
        
        stairWoolLightGrey = new Stair(Blocks.wool, "stairWoolLightGrey", 8);
        GameRegistry.registerBlock((Block)stairWoolLightGrey, (String)"stairWoolLightGrey");
        slabWoolLightGrey = new Slab(Blocks.wool, "slabWoolLightGrey", false, 8);
        doubleSlabWoolLightGrey = new Slab(Blocks.wool, "doubleSlabWoolLightGrey", true, 8);
        GameRegistry.registerBlock((Block)slabWoolLightGrey, (String)"slabWoolLightGrey");
        GameRegistry.registerBlock((Block)doubleSlabWoolLightGrey, (String)"doubleSlabWoolLightGrey");
        verticalSlabWoolLightGrey = new VerticalSlab(Blocks.wool, "verticalSlabWoolLightGrey", 8);
        GameRegistry.registerBlock((Block)verticalSlabWoolLightGrey, (String)"verticalSlabWoolLightGrey");
        
        stairWoolCyan = new Stair(Blocks.wool, "stairWoolCyan", 9);
        GameRegistry.registerBlock((Block)stairWoolCyan, (String)"stairWoolCyan");
        slabWoolCyan = new Slab(Blocks.wool, "slabWoolCyan", false, 9);
        doubleSlabWoolCyan = new Slab(Blocks.wool, "doubleSlabWoolCyan", true, 9);
        GameRegistry.registerBlock((Block)slabWoolCyan, (String)"slabWoolCyan");
        GameRegistry.registerBlock((Block)doubleSlabWoolCyan, (String)"doubleSlabWoolCyan");
        verticalSlabWoolCyan = new VerticalSlab(Blocks.wool, "verticalSlabWoolCyan", 9);
        GameRegistry.registerBlock((Block)verticalSlabWoolCyan, (String)"verticalSlabWoolCyan");
        
        stairWoolPurple = new Stair(Blocks.wool, "stairWoolPurple", 10);
        GameRegistry.registerBlock((Block)stairWoolPurple, (String)"stairWoolPurple");
        slabWoolPurple = new Slab(Blocks.wool, "slabWoolPurple", false, 10);
        doubleSlabWoolPurple = new Slab(Blocks.wool, "doubleSlabWoolPurple", true, 10);
        GameRegistry.registerBlock((Block)slabWoolPurple, (String)"slabWoolPurple");
        GameRegistry.registerBlock((Block)doubleSlabWoolPurple, (String)"doubleSlabWoolPurple");
        verticalSlabWoolPurple = new VerticalSlab(Blocks.wool, "verticalSlabWoolPurple", 10);
        GameRegistry.registerBlock((Block)verticalSlabWoolPurple, (String)"verticalSlabWoolPurple");
        
        stairWoolBlue = new Stair(Blocks.wool, "stairWoolBlue", 11);
        GameRegistry.registerBlock((Block)stairWoolBlue, (String)"stairWoolBlue");
        slabWoolBlue = new Slab(Blocks.wool, "slabWoolBlue", false, 11);
        doubleSlabWoolBlue = new Slab(Blocks.wool, "doubleSlabWoolBlue", true, 11);
        GameRegistry.registerBlock((Block)slabWoolBlue, (String)"slabWoolBlue");
        GameRegistry.registerBlock((Block)doubleSlabWoolBlue, (String)"doubleSlabWoolBlue");
        verticalSlabWoolBlue = new VerticalSlab(Blocks.wool, "verticalSlabWoolBlue", 11);
        GameRegistry.registerBlock((Block)verticalSlabWoolBlue, (String)"verticalSlabWoolBlue");
        
        stairWoolBrown = new Stair(Blocks.wool, "stairWoolBrown", 12);
        GameRegistry.registerBlock((Block)stairWoolBrown, (String)"stairWoolBrown");
        slabWoolBrown = new Slab(Blocks.wool, "slabWoolBrown", false, 12);
        doubleSlabWoolBrown = new Slab(Blocks.wool, "doubleSlabWoolBrown", true, 12);
        GameRegistry.registerBlock((Block)slabWoolBrown, (String)"slabWoolBrown");
        GameRegistry.registerBlock((Block)doubleSlabWoolBrown, (String)"doubleSlabWoolBrown");
        verticalSlabWoolBrown = new VerticalSlab(Blocks.wool, "verticalSlabWoolBrown", 12);
        GameRegistry.registerBlock((Block)verticalSlabWoolBrown, (String)"verticalSlabWoolBrown");
        
        stairWoolGreen = new Stair(Blocks.wool, "stairWoolGreen", 13);
        GameRegistry.registerBlock((Block)stairWoolGreen, (String)"stairWoolGreen");
        slabWoolGreen = new Slab(Blocks.wool, "slabWoolGreen", false, 13);
        doubleSlabWoolGreen = new Slab(Blocks.wool, "doubleSlabWoolGreen", true, 13);
        GameRegistry.registerBlock((Block)slabWoolGreen, (String)"slabWoolGreen");
        GameRegistry.registerBlock((Block)doubleSlabWoolGreen, (String)"doubleSlabWoolGreen");
        verticalSlabWoolGreen = new VerticalSlab(Blocks.wool, "verticalSlabWoolGreen", 13);
        GameRegistry.registerBlock((Block)verticalSlabWoolGreen, (String)"verticalSlabWoolGreen");
        
        stairWoolRed = new Stair(Blocks.wool, "stairWoolRed", 14);
        GameRegistry.registerBlock((Block)stairWoolRed, (String)"stairWoolRed");
        slabWoolRed = new Slab(Blocks.wool, "slabWoolRed", false, 14);
        doubleSlabWoolRed = new Slab(Blocks.wool, "doubleSlabWoolRed", true, 14);
        GameRegistry.registerBlock((Block)slabWoolRed, (String)"slabWoolRed");
        GameRegistry.registerBlock((Block)doubleSlabWoolRed, (String)"doubleSlabWoolRed");
        verticalSlabWoolRed = new VerticalSlab(Blocks.wool, "verticalSlabWoolRed", 14);
        GameRegistry.registerBlock((Block)verticalSlabWoolRed, (String)"verticalSlabWoolRed");
        
        stairWoolBlack = new Stair(Blocks.wool, "stairWoolBlack", 15);
        GameRegistry.registerBlock((Block)stairWoolBlack, (String)"stairWoolBlack");
        slabWoolBlack = new Slab(Blocks.wool, "slabWoolBlack", false, 15);
        doubleSlabWoolBlack = new Slab(Blocks.wool, "doubleSlabWoolBlack", true, 15);
        GameRegistry.registerBlock((Block)slabWoolBlack, (String)"slabWoolBlack");
        GameRegistry.registerBlock((Block)doubleSlabWoolBlack, (String)"doubleSlabWoolBlack");
        verticalSlabWoolBlack = new VerticalSlab(Blocks.wool, "verticalSlabWoolBlack", 15);
        GameRegistry.registerBlock((Block)verticalSlabWoolBlack, (String)"verticalSlabWoolBlack");
        
        stairClayWhite = new Stair(Blocks.stained_hardened_clay, "stairClayWhite", 0);
        GameRegistry.registerBlock((Block)stairClayWhite, (String)"stairClayWhite");
        slabClayWhite = new Slab(Blocks.stained_hardened_clay, "slabClayWhite", false, 0);
        doubleSlabClayWhite = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayWhite", true, 0);
        GameRegistry.registerBlock((Block)slabClayWhite, (String)"slabClayWhite");
        GameRegistry.registerBlock((Block)doubleSlabClayWhite, (String)"doubleSlabClayWhite");
        verticalSlabClayWhite = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayWhite", 0);
        GameRegistry.registerBlock((Block)verticalSlabClayWhite, (String)"verticalSlabClayWhite");
        
        stairClayOrange = new Stair(Blocks.stained_hardened_clay, "stairClayOrange", 1);
        GameRegistry.registerBlock((Block)stairClayOrange, (String)"stairClayOrange");
        slabClayOrange = new Slab(Blocks.stained_hardened_clay, "slabClayOrange", false, 1);
        doubleSlabClayOrange = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayOrange", true, 1);
        GameRegistry.registerBlock((Block)slabClayOrange, (String)"slabClayOrange");
        GameRegistry.registerBlock((Block)doubleSlabClayOrange, (String)"doubleSlabClayOrange");
        verticalSlabClayOrange = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayOrange", 1);
        GameRegistry.registerBlock((Block)verticalSlabClayOrange, (String)"verticalSlabClayOrange");
        
        stairClayMagenta = new Stair(Blocks.stained_hardened_clay, "stairClayMagenta", 2);
        GameRegistry.registerBlock((Block)stairClayMagenta, (String)"stairClayMagenta");
        slabClayMagenta = new Slab(Blocks.stained_hardened_clay, "slabClayMagenta", false, 2);
        doubleSlabClayMagenta = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayMagenta", true, 2);
        GameRegistry.registerBlock((Block)slabClayMagenta, (String)"slabClayMagenta");
        GameRegistry.registerBlock((Block)doubleSlabClayMagenta, (String)"doubleSlabClayMagenta");
        verticalSlabClayMagenta = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayMagenta", 2);
        GameRegistry.registerBlock((Block)verticalSlabClayMagenta, (String)"verticalSlabClayMagenta");
        
        stairClayLightBlue = new Stair(Blocks.stained_hardened_clay, "stairClayLightBlue", 3);
        GameRegistry.registerBlock((Block)stairClayLightBlue, (String)"stairClayLightBlue");
        slabClayLightBlue = new Slab(Blocks.stained_hardened_clay, "slabClayLightBlue", false, 3);
        doubleSlabClayLightBlue = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayLightBlue", true, 3);
        GameRegistry.registerBlock((Block)slabClayLightBlue, (String)"slabClayLightBlue");
        GameRegistry.registerBlock((Block)doubleSlabClayLightBlue, (String)"doubleSlabClayLightBlue");
        verticalSlabClayLightBlue = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayLightBlue", 3);
        GameRegistry.registerBlock((Block)verticalSlabClayLightBlue, (String)"verticalSlabClayLightBlue");
        
        stairClayYellow = new Stair(Blocks.stained_hardened_clay, "stairClayYellow", 4);
        GameRegistry.registerBlock((Block)stairClayYellow, (String)"stairClayYellow");
        slabClayYellow = new Slab(Blocks.stained_hardened_clay, "slabClayYellow", false, 4);
        doubleSlabClayYellow = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayYellow", true, 4);
        GameRegistry.registerBlock((Block)slabClayYellow, (String)"slabClayYellow");
        GameRegistry.registerBlock((Block)doubleSlabClayYellow, (String)"doubleSlabClayYellow");
        verticalSlabClayYellow = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayYellow", 4);
        GameRegistry.registerBlock((Block)verticalSlabClayYellow, (String)"verticalSlabClayYellow");
       
        stairClayLightGreen = new Stair(Blocks.stained_hardened_clay, "stairClayLightGreen", 5);
        GameRegistry.registerBlock((Block)stairClayLightGreen, (String)"stairClayLightGreen");
        slabClayLightGreen = new Slab(Blocks.stained_hardened_clay, "slabClayLightGreen", false, 5);
        doubleSlabClayLightGreen = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayLightGreen", true, 5);
        GameRegistry.registerBlock((Block)slabClayLightGreen, (String)"slabClayLightGreen");
        GameRegistry.registerBlock((Block)doubleSlabClayLightGreen, (String)"doubleSlabClayLightGreen");
        verticalSlabClayLightGreen = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayLightGreen", 5);
        GameRegistry.registerBlock((Block)verticalSlabClayLightGreen, (String)"verticalSlabClayLightGreen");
        
        stairClayPink = new Stair(Blocks.stained_hardened_clay, "stairWooPink", 6);
        GameRegistry.registerBlock((Block)stairClayPink, (String)"stairClayPink");
        slabClayPink = new Slab(Blocks.stained_hardened_clay, "slabClayPink", false, 6);
        doubleSlabClayPink = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayPink", true, 6);
        GameRegistry.registerBlock((Block)slabClayPink, (String)"slabClayPink");
        GameRegistry.registerBlock((Block)doubleSlabClayPink, (String)"doubleSlabClayPink");
        verticalSlabClayPink = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayPink", 6);
        GameRegistry.registerBlock((Block)verticalSlabClayPink, (String)"verticalSlabClayPink");
        
        stairClayGrey = new Stair(Blocks.stained_hardened_clay, "stairClayGrey", 7);
        GameRegistry.registerBlock((Block)stairClayGrey, (String)"stairClayGrey");
        slabClayGrey = new Slab(Blocks.stained_hardened_clay, "slabClayGrey", false, 7);
        doubleSlabClayGrey = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayGrey", true, 7);
        GameRegistry.registerBlock((Block)slabClayGrey, (String)"slabClayGrey");
        GameRegistry.registerBlock((Block)doubleSlabClayGrey, (String)"doubleSlabClayGrey");
        verticalSlabClayGrey = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayGrey", 7);
        GameRegistry.registerBlock((Block)verticalSlabClayGrey, (String)"verticalSlabClayGrey");
       
        stairClayLightGrey = new Stair(Blocks.stained_hardened_clay, "stairClayLightGrey", 8);
        GameRegistry.registerBlock((Block)stairClayLightGrey, (String)"stairClayLightGrey");
        slabClayLightGrey = new Slab(Blocks.stained_hardened_clay, "slabClayLightGrey", false, 8);
        doubleSlabClayLightGrey = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayLightGrey", true, 8);
        GameRegistry.registerBlock((Block)slabClayLightGrey, (String)"slabClayLightGrey");
        GameRegistry.registerBlock((Block)doubleSlabClayLightGrey, (String)"doubleSlabClayLightGrey");
        verticalSlabClayLightGrey = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayLightGrey", 8);
        GameRegistry.registerBlock((Block)verticalSlabClayLightGrey, (String)"verticalSlabClayLightGrey");
        
        stairClayCyan = new Stair(Blocks.stained_hardened_clay, "stairClayCyan", 9);
        GameRegistry.registerBlock((Block)stairClayCyan, (String)"stairClayCyan");
        slabClayCyan = new Slab(Blocks.stained_hardened_clay, "slabClayCyan", false, 9);
        doubleSlabClayCyan = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayCyan", true, 9);
        GameRegistry.registerBlock((Block)slabClayCyan, (String)"slabClayCyan");
        GameRegistry.registerBlock((Block)doubleSlabClayCyan, (String)"doubleSlabClayCyan");
        verticalSlabClayCyan = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayCyan", 9);
        GameRegistry.registerBlock((Block)verticalSlabClayCyan, (String)"verticalSlabClayCyan");
        
        stairClayPurple = new Stair(Blocks.stained_hardened_clay, "stairClayPurple", 10);
        GameRegistry.registerBlock((Block)stairClayPurple, (String)"stairClayPurple");
        slabClayPurple = new Slab(Blocks.stained_hardened_clay, "slabClayPurple", false, 10);
        doubleSlabClayPurple = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayPurple", true, 10);
        GameRegistry.registerBlock((Block)slabClayPurple, (String)"slabClayPurple");
        GameRegistry.registerBlock((Block)doubleSlabClayPurple, (String)"doubleSlabClayPurple");
        verticalSlabClayPurple = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayPurple", 10);
        GameRegistry.registerBlock((Block)verticalSlabClayPurple, (String)"verticalSlabClayPurple");
        
        stairClayBlue = new Stair(Blocks.stained_hardened_clay, "stairClayBlue", 11);
        GameRegistry.registerBlock((Block)stairClayBlue, (String)"stairClayBlue");
        slabClayBlue = new Slab(Blocks.stained_hardened_clay, "slabClayBlue", false, 11);
        doubleSlabClayBlue = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayBlue", true, 11);
        GameRegistry.registerBlock((Block)slabClayBlue, (String)"slabClayBlue");
        GameRegistry.registerBlock((Block)doubleSlabClayBlue, (String)"doubleSlabClayBlue");
        verticalSlabClayBlue = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayBlue", 11);
        GameRegistry.registerBlock((Block)verticalSlabClayBlue, (String)"verticalSlabClayBlue");
        
        stairClayBrown = new Stair(Blocks.stained_hardened_clay, "stairClayBrown", 12);
        GameRegistry.registerBlock((Block)stairClayBrown, (String)"stairClayBrown");
        slabClayBrown = new Slab(Blocks.stained_hardened_clay, "slabClayBrown", false, 12);
        doubleSlabClayBrown = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayBrown", true, 12);
        GameRegistry.registerBlock((Block)slabClayBrown, (String)"slabClayBrown");
        GameRegistry.registerBlock((Block)doubleSlabClayBrown, (String)"doubleSlabClayBrown");
        verticalSlabClayBrown = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayBrown", 12);
        GameRegistry.registerBlock((Block)verticalSlabClayBrown, (String)"verticalSlabClayBrown");
        
        stairClayGreen = new Stair(Blocks.stained_hardened_clay, "stairClayGreen", 13);
        GameRegistry.registerBlock((Block)stairClayGreen, (String)"stairClayGreen");
        slabClayGreen = new Slab(Blocks.stained_hardened_clay, "slabClayGreen", false, 13);
        doubleSlabClayGreen = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayGreen", true, 13);
        GameRegistry.registerBlock((Block)slabClayGreen, (String)"slabClayGreen");
        GameRegistry.registerBlock((Block)doubleSlabClayGreen, (String)"doubleSlabClayGreen");
        verticalSlabClayGreen = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayGreen", 13);
        GameRegistry.registerBlock((Block)verticalSlabClayGreen, (String)"verticalSlabClayGreen");
        
        stairClayRed = new Stair(Blocks.stained_hardened_clay, "stairClayRed", 14);
        GameRegistry.registerBlock((Block)stairClayRed, (String)"stairClayRed");
        slabClayRed = new Slab(Blocks.stained_hardened_clay, "slabClayRed", false, 14);
        doubleSlabClayRed = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayRed", true, 14);
        GameRegistry.registerBlock((Block)slabClayRed, (String)"slabClayRed");
        GameRegistry.registerBlock((Block)doubleSlabClayRed, (String)"doubleSlabClayRed");
        verticalSlabClayRed = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayRed", 14);
        GameRegistry.registerBlock((Block)verticalSlabClayRed, (String)"verticalSlabClayRed");
        
        stairClayBlack = new Stair(Blocks.stained_hardened_clay, "stairClayBlack", 15);
        GameRegistry.registerBlock((Block)stairClayBlack, (String)"stairClayBlack");
        slabClayBlack = new Slab(Blocks.stained_hardened_clay, "slabClayBlack", false, 15);
        doubleSlabClayBlack = new Slab(Blocks.stained_hardened_clay, "doubleSlabClayBlack", true, 15);
        GameRegistry.registerBlock((Block)slabClayBlack, (String)"slabClayBlack");
        GameRegistry.registerBlock((Block)doubleSlabClayBlack, (String)"doubleSlabClayBlack");
        verticalSlabClayBlack = new VerticalSlab(Blocks.stained_hardened_clay, "verticalSlabClayBlack", 15);
        GameRegistry.registerBlock((Block)verticalSlabClayBlack, (String)"verticalSlabClayBlack");
       
        verticalSlabStone = new VerticalSlab(Blocks.stone, "verticalSlabStone");
        GameRegistry.registerBlock((Block)verticalSlabStone, (String)"verticalSlabStone");
       
        verticalSlabDirt = new VerticalSlab(Blocks.dirt, "verticalSlabDirt");
        GameRegistry.registerBlock((Block)verticalSlabDirt, (String)"verticalSlabDirt");
        
        verticalSlabCobblestone = new VerticalSlab(Blocks.cobblestone, "verticalSlabCobblestone");
        GameRegistry.registerBlock((Block)verticalSlabCobblestone, (String)"verticalSlabCobblestone");
       
        verticalSlabGravel = new VerticalSlab(Blocks.gravel, "verticalSlabGravel");
        GameRegistry.registerBlock((Block)verticalSlabGravel, (String)"verticalSlabGravel");
        
        verticalSlabBrick = new VerticalSlab(Blocks.brick_block, "verticalSlabBrick");
        GameRegistry.registerBlock((Block)verticalSlabBrick, (String)"verticalSlabBrick");
        
        verticalSlabCoal = new VerticalSlab(Blocks.coal_block, "verticalSlabCoal");
        GameRegistry.registerBlock((Block)verticalSlabCoal, (String)"verticalSlabCoal");
        
        verticalSlabStonebrick = new VerticalSlab(Blocks.stonebrick, "verticalSlabStonebrick", 0);
        GameRegistry.registerBlock((Block)verticalSlabStonebrick, (String)"verticalSlabStonebrick");
        
        verticalSlabMossyStonebrick = new VerticalSlab(Blocks.stonebrick, "verticalSlabMossyStonebrick", 1);
        GameRegistry.registerBlock((Block)verticalSlabMossyStonebrick, (String)"verticalSlabMossyStonebrick");
        
        verticalSlabStonebrickCracked = new VerticalSlab(Blocks.stonebrick, "verticalSlabStonebrickCracked", 2);
        GameRegistry.registerBlock((Block)verticalSlabStonebrickCracked, (String)"verticalSlabStonebrickCracked");
        
        verticalSlabStonebrickChiselled = new VerticalSlab(Blocks.stonebrick, "verticalSlabStonebrickChiselled", 3);
        GameRegistry.registerBlock((Block)verticalSlabStonebrickChiselled, (String)"verticalSlabStonebrickChiselled");
       
        verticalSlabQuartz = new VerticalSlab(Blocks.quartz_block, "verticalSlabQuartz", 0);
        GameRegistry.registerBlock((Block)verticalSlabQuartz, (String)"verticalSlabQuartz");
        
        verticalSlabQuartzChiselled = new VerticalSlab(Blocks.quartz_block, "verticalSlabQuartzChiselled", 1);
        GameRegistry.registerBlock((Block)verticalSlabQuartzChiselled, (String)"verticalSlabQuartzChiselled");
        
        darkGravel = new Gravel("GravierSombre", "modsda:b_graviersombre");
        GameRegistry.registerBlock((Block)darkGravel, (String)"gravier_sombre");
        slabDarkGravel = new Slab(darkGravel, "slabDarkGravel", false);
        doubleSlabDarkGravel = new Slab(darkGravel, "doubleSlabDarkGravel", true);
        GameRegistry.registerBlock((Block)slabDarkGravel, (Class)ItemDalle.class, (String)"slabDarkGravel");
        GameRegistry.registerBlock((Block)doubleSlabDarkGravel, (Class)ItemDalle.class, (String)"doubleSlabDarkGravel");
        verticalSlabDarkGravel = new VerticalSlab(darkGravel, "verticalSlabDarkGravel");
        GameRegistry.registerBlock((Block)verticalSlabDarkGravel, (String)"verticalSlabDarkGravel");
        
        lightGravel = new Gravel("GravierClair", "modsda:b_gravierclair");
        GameRegistry.registerBlock((Block)lightGravel, (String)"gravier_clair");
        slabLightGravel = new Slab(lightGravel, "slabLightGravel", false);
        doubleSlabLightGravel = new Slab(lightGravel, "doubleSlabLightGravel", true);
        GameRegistry.registerBlock((Block)slabLightGravel, (Class)ItemDalle.class, (String)"slabLightGravel");
        GameRegistry.registerBlock((Block)doubleSlabLightGravel, (Class)ItemDalle.class, (String)"doubleSlabLightGravel");
        verticalSlabLightGravel = new VerticalSlab(lightGravel, "verticalSlabLightGravel");
        GameRegistry.registerBlock((Block)verticalSlabLightGravel, (String)"verticalSlabLightGravel");
        
        dirtGravel = new Gravel("GravierTerre", "modsda:b_gravierterre");
        GameRegistry.registerBlock((Block)dirtGravel, (String)"gravier_terre");
        slabDirtGravel = new Slab(dirtGravel, "slabDirtGravel", false);
        doubleSlabDirtGravel = new Slab(dirtGravel, "doubleSlabDirtGravel", true);
        GameRegistry.registerBlock((Block)slabDirtGravel, (Class)ItemDalle.class, (String)"slabDirtGravel");
        GameRegistry.registerBlock((Block)doubleSlabDirtGravel, (Class)ItemDalle.class, (String)"doubleSlabDirtGravel");
        verticalSlabDirtGravel = new VerticalSlab(dirtGravel, "verticalSlabDirtGravel");
        GameRegistry.registerBlock((Block)verticalSlabDirtGravel, (String)"verticalSlabDirtGravel");
        
        darkDirtGravel = new Gravel("GravierTerreSombre", "modsda:b_gravierterresombre");
        GameRegistry.registerBlock((Block)darkDirtGravel, (String)"gravier_terre_sombre");
        slabDarkDirtGravel = new Slab(darkDirtGravel, "slabDarkDirtGravel", false);
        doubleSlabDarkDirtGravel = new Slab(darkDirtGravel, "doubleSlabDarkDirtGravel", true);
        GameRegistry.registerBlock((Block)slabDarkDirtGravel, (Class)ItemDalle.class, (String)"slabDarkDirtGravel");
        GameRegistry.registerBlock((Block)doubleSlabDarkDirtGravel, (Class)ItemDalle.class, (String)"doubleSlabDarkDirtGravel");
        verticalSlabDarkDirtGravel = new VerticalSlab(darkDirtGravel, "verticalSlabDarkDirtGravel");
        GameRegistry.registerBlock((Block)verticalSlabDarkDirtGravel, (String)"verticalSlabDarkDirtGravel");
        
        darkDirt = new Dirt("TerreSombre", "modsda:b_terresombre");
        GameRegistry.registerBlock((Block)darkDirt, (String)"terre_sombre");
        
        redSand = new Sand("redsand", "modsda:b_redsand");
        GameRegistry.registerBlock((Block)redSand, (String)"redsand");
       
        sable = new Sand("sable", "modsda:b_sable");
        GameRegistry.registerBlock((Block)sable, (String)"sable");
        slabSable = new Slab(sable, "slabSable", false);
        doubleSlabSable = new Slab(sable, "doubleSlabSable", true);
        GameRegistry.registerBlock((Block)slabSable, (Class)ItemDalle.class, (String)"slabSable");
        GameRegistry.registerBlock((Block)doubleSlabSable, (Class)ItemDalle.class, (String)"doubleSlabSable");
        wallSable = new Wall(sable, "wallSable");
        GameRegistry.registerBlock((Block)wallSable, (String)"wallSable");
        verticalSlabSable = new VerticalSlab(sable, "verticalSlabSable");
        GameRegistry.registerBlock((Block)verticalSlabSable, (String)"verticalSlabSable");
       
        hellSand = new Dirt("hellSand", "modsda:hellsand");
        GameRegistry.registerBlock((Block)hellSand, (String)"hellSand");
        
        dirtPodzol = new GrassBloc("dirtPodzol", "modsda:dirtPodzol");
        GameRegistry.registerBlock((Block)dirtPodzol, (String)"dirtPodzol");
        
        driedGrass = new GrassBlocColor("driedGrass", "modsda:dried_grass");
        GameRegistry.registerBlock((Block)driedGrass, (String)"driedGrass");
        
        paille2 = new Paille("paille2", "modsda:hay");
        GameRegistry.registerBlock((Block)paille2, (String)"paille2");
        escalierPaille = new Stair(paille2, "escalierpaille");
        GameRegistry.registerBlock((Block)escalierPaille, (String)"escalierpaille");
        slabpaille2 = new Slab(paille2, "slabpaille2", false);
        doubleSlabpaille2 = new Slab(paille2, "doubleSlabpaille2", true);
        GameRegistry.registerBlock((Block)slabpaille2, (String)"slabpaille2");
        GameRegistry.registerBlock((Block)doubleSlabpaille2, (String)"doubleSlabpaille2");
        verticalSlabpaille2 = new VerticalSlab(paille2, "verticalSlabpaille2");
        GameRegistry.registerBlock((Block)verticalSlabpaille2, (String)"verticalSlabpaille2");
        
        thatch = new Thatch("thatch", "modsda:thatch");
        GameRegistry.registerBlock((Block)thatch, (String)"thatch");
        stairThatch = new Stair(thatch, "stairThatch");
        GameRegistry.registerBlock((Block)stairThatch, (String)"stairThatch");
        slabThatch = new Slab(thatch, "slabThatch", false);
        doubleSlabThatch = new Slab(thatch, "doubleSlabThatch", true);
        GameRegistry.registerBlock((Block)slabThatch, (String)"slabThatch");
        GameRegistry.registerBlock((Block)doubleSlabThatch, (String)"doubleSlabThatch");
        verticalSlabThatch = new VerticalSlab(thatch, "verticalSlabThatch");
        GameRegistry.registerBlock((Block)verticalSlabThatch, (String)"verticalSlabThatch");
       
        
        
        
        
        //MINERAI
        
        lime = new Rock("lime", "modsda:b_lime");
        GameRegistry.registerBlock((Block)lime, (String)"lime");
        
        stairLime = new Stair(lime, "stairLime");
        GameRegistry.registerBlock((Block)stairLime, (String)"stairLime");
       
        granite = new Rock("granite", "modsda:b_granite");
        GameRegistry.registerBlock((Block)granite, (String)"granite");
       
        stairGranite = new Stair(granite, "stairGranite");
        GameRegistry.registerBlock((Block)stairGranite, (String)"stairGranite");
       
        copperblock = new Rock("copperblock", "modsda:b_copperblock");
        GameRegistry.registerBlock((Block)copperblock, (String)"copperblock");
       
        etain = new Mineral("etain", "modsda:etain").setHardness(3.0f);
        GameRegistry.registerBlock((Block)etain, (String)"etain");
       
        cuivre = new Mineral("cuivre", "modsda:cuivre").setHardness(3.0f);
        GameRegistry.registerBlock((Block)cuivre, (String)"cuivre");
       
        electrum = new Mineral("electrum", "modsda:electrum").setHardness(3.0f);
        GameRegistry.registerBlock((Block)electrum, (String)"electrum");
        
        mithril = new Mineral("mithril", "modsda:mithril").setHardness(3.0f);
        GameRegistry.registerBlock((Block)mithril, (String)"mithril");
        
        rubis = new Mineral("rubis", "modsda:rubis").setHardness(3.0f);
        GameRegistry.registerBlock((Block)rubis, (String)"rubis");
       
        saphir = new Mineral("saphir", "modsda:saphir").setHardness(3.0f);
        GameRegistry.registerBlock((Block)saphir, (String)"saphir");
        
        saphirBis = new Mineral("saphir2", "modsda:saphir2").setHardness(3.0f);
        GameRegistry.registerBlock((Block)saphirBis, (String)"saphir2");
       
        saphirTer = new Mineral("saphir3", "modsda:saphir3").setHardness(3.0f);
        GameRegistry.registerBlock((Block)saphirTer, (String)"saphir3");
       
        soufre = new Mineral("soufre", "modsda:soufre").setHardness(3.0f);
        GameRegistry.registerBlock((Block)soufre, (String)"soufre");
       
        zinc = new Mineral("zinc", "modsda:zinc").setHardness(3.0f);
        GameRegistry.registerBlock((Block)zinc, (String)"zinc");
       
        zincBis = new Mineral("zinc2", "modsda:zinc2").setHardness(3.0f);
        GameRegistry.registerBlock((Block)zincBis, (String)"zinc2");
        
 
        
        
        
        //ETENDARD
       
        blasonServer = new MuralDecoration("blasonHeritiers", "modsda:heritiers");
        GameRegistry.registerBlock((Block)blasonServer, (String)"blasonHeritiers");
        
        bannerGundabad = new MuralDecoration("bannerGundabad", "modsda:bannerGundabad");
        GameRegistry.registerBlock((Block)bannerGundabad, (String)"bannerGundabad");
        
        bannerIsengard = new MuralDecoration("bannerIsengard", "modsda:bannerIsengard");
        GameRegistry.registerBlock((Block)bannerIsengard, (String)"bannerIsengard");
       
        bannerUmbar = new MuralDecoration("bannerUmbar", "modsda:bannerUmbar");
        GameRegistry.registerBlock((Block)bannerUmbar, (String)"bannerUmbar");
        
        bannerErebor = new MuralDecoration("bannerErebor", "modsda:bannerErebor");
        GameRegistry.registerBlock((Block)bannerErebor, (String)"bannerErebor");
        
        etendardAngmarHaut = new Etendard("etendardAngmarHaut", "modsda:etendard_angmar_haut");
        GameRegistry.registerBlock((Block)etendardAngmarHaut, (String)"etendardAngmarHaut");
        
        etendardAngmarMilieu = new Etendard("etendardAngmarMilieu", "modsda:etendard_angmar_milieu");
        GameRegistry.registerBlock((Block)etendardAngmarMilieu, (String)"etendardAngmarMilieu");
        
        etendardAngmarBas = new Etendard("etendardAngmarBas", "modsda:etendard_angmar_bas");
        GameRegistry.registerBlock((Block)etendardAngmarBas, (String)"etendardAngmarBas");
        
        etendardAngmarFin = new Etendard("etendardAngmarFin", "modsda:etendard_angmar_fin");
        GameRegistry.registerBlock((Block)etendardAngmarFin, (String)"etendardAngmarFin");
        
        etendardAngmarVide = new Etendard("etendardAngmarVide", "modsda:etendard_angmar_vide");
        GameRegistry.registerBlock((Block)etendardAngmarVide, (String)"etendardAngmarVide");
        
        etendardAngmarMilieuVide = new Etendard("etendardAngmarMilieuVide", "modsda:etendard_angmar_milieu_vide");
        GameRegistry.registerBlock((Block)etendardAngmarMilieuVide, (String)"etendardAngmarMilieuVide");
        
        etendardIsengardHaut = new Etendard("etendardIsengardHaut", "modsda:etendard_isengard_haut");
        GameRegistry.registerBlock((Block)etendardIsengardHaut, (String)"etendardIsengardHaut");
        
        etendardIsengardMilieu = new Etendard("etendardIsengardMilieu", "modsda:etendard_isengard_milieu");
        GameRegistry.registerBlock((Block)etendardIsengardMilieu, (String)"etendardIsengardMilieu");
        
        etendardIsengardBas = new Etendard("etendardAngmarBas", "modsda:etendard_isengard_bas");
        GameRegistry.registerBlock((Block)etendardIsengardBas, (String)"etendardIsengardBas");
        
        etendardIsengardFin = new Etendard("etendardIsengardFin", "modsda:etendard_isengard_fin");
        GameRegistry.registerBlock((Block)etendardIsengardFin, (String)"etendardIsengardFin");
        
        etendardIsengardVide = new Etendard("etendardIsengardVide", "modsda:etendard_isengard_vide");
        GameRegistry.registerBlock((Block)etendardIsengardVide, (String)"etendardIsengardVide");
       
        etendardMordorHaut = new Etendard("etendardMordorHaut", "modsda:etendard_mordor_haut");
        GameRegistry.registerBlock((Block)etendardMordorHaut, (String)"etendardMordorHaut");
       
        etendardMordorMilieu = new Etendard("etendardMordorMilieu", "modsda:etendard_mordor_milieu");
        GameRegistry.registerBlock((Block)etendardMordorMilieu, (String)"etendardMordorMilieu");
        
        etendardMordorBas = new Etendard("etendardMordorBas", "modsda:etendard_mordor_bas");
        GameRegistry.registerBlock((Block)etendardMordorBas, (String)"etendardMordorBas");
       
        etendardMordorFin = new Etendard("etendardMordorFin", "modsda:etendard_mordor_fin");
        GameRegistry.registerBlock((Block)etendardMordorFin, (String)"etendardMordorFin");
        
        etendardMordorVide = new Etendard("etendardMordorVide", "modsda:etendard_mordor_vide");
        GameRegistry.registerBlock((Block)etendardMordorVide, (String)"etendardMordorVide");
       
        etendardUmbarHaut = new Etendard("etendardUmbarHaut", "modsda:etendard_umbar_haut");
        GameRegistry.registerBlock((Block)etendardUmbarHaut, (String)"etendardUmbarHaut");
        
        etendardUmbarBas = new Etendard("etendardUmbarBas", "modsda:etendard_umbar_bas");
        GameRegistry.registerBlock((Block)etendardUmbarBas, (String)"etendardUmbarBas");
        
        etendardUmbarFin = new Etendard("etendardUmbarFin", "modsda:etendard_umbar_fin");
        GameRegistry.registerBlock((Block)etendardUmbarFin, (String)"etendardUmbardFin");
        
        etendardUmbarVide = new Etendard("etendardUmbarVide", "modsda:etendard_umbar_vide");
        GameRegistry.registerBlock((Block)etendardUmbarVide, (String)"etendardUmbarVide");
        
        etendardUmbarFirst = new Etendard("etendardUmbarFirst", "modsda:etendard_umbar_first");
        GameRegistry.registerBlock((Block)etendardUmbarFirst, (String)"etendardUmbardFirst");
        
        etendardUmbarSecond = new Etendard("etendardUmbarSecond", "modsda:etendard_umbar_second");
        GameRegistry.registerBlock((Block)etendardUmbarSecond, (String)"etendardUmbarSecond");
        
        etendardHaradHaut = new Etendard("etendardHaradHaut", "modsda:etendard_harad_haut");
        GameRegistry.registerBlock((Block)etendardHaradHaut, (String)"etendardHaradHaut");
        
        etendardHaradMilieu = new Etendard("etendardHaradMilieu", "modsda:etendard_harad_milieu");
        GameRegistry.registerBlock((Block)etendardHaradMilieu, (String)"etendardHaradMilieu");
       
        etendardHaradBas = new Etendard("etendardHaradBas", "modsda:etendard_harad_bas");
        GameRegistry.registerBlock((Block)etendardHaradBas, (String)"etendardHaradBas");
        
        etendardDunHaut = new Etendard("etendardDunHaut", "modsda:etendard_dun_haut");
        GameRegistry.registerBlock((Block)etendardDunHaut, (String)"etendardDunHaut");
        
        etendardDunVide = new Etendard("etendardDunVide", "modsda:etendard_dun_vide");
        GameRegistry.registerBlock((Block)etendardDunVide, (String)"etendardDunVide");
       
        etendardDunBas = new Etendard("etendardDunBas", "modsda:etendard_dun_bas");
        GameRegistry.registerBlock((Block)etendardDunBas, (String)"etendardDunBas");
        
        etendardDunFin = new Etendard("etendardDunFin", "modsda:etendard_dun_fin");
        GameRegistry.registerBlock((Block)etendardDunFin, (String)"etendardDunFin");
        
        etendardRhunHaut = new Etendard("etendardRhunHaut", "modsda:etendard_rhun_haut");
        GameRegistry.registerBlock((Block)etendardRhunHaut, (String)"etendardRhunHaut");
        
        etendardRhunVide = new Etendard("etendardRhunVide", "modsda:etendard_rhun_vide");
        GameRegistry.registerBlock((Block)etendardRhunVide, (String)"etendardRhunVide");
        
        etendardRhunBas = new Etendard("etendardRhunBas", "modsda:etendard_rhun_bas");
        GameRegistry.registerBlock((Block)etendardRhunBas, (String)"etendardRhunBas");
       
        etendardRhunFin = new Etendard("etendardRhunFin", "modsda:etendard_rhun_fin");
        GameRegistry.registerBlock((Block)etendardRhunFin, (String)"etendardRhunFin");
        
        etendardRohanHaut = new Etendard("etendardRohanHaut", "modsda:etendard_rohan_haut");
        GameRegistry.registerBlock((Block)etendardRohanHaut, (String)"etendardRohanHaut");
        
        etendardRohanVide = new Etendard("etendardRohanVide", "modsda:etendard_rohan_vide");
        GameRegistry.registerBlock((Block)etendardRohanVide, (String)"etendardRohanVide");
        
        etendardRohanBas = new Etendard("etendardRohanBas", "modsda:etendard_rohan_bas");
        GameRegistry.registerBlock((Block)etendardRohanBas, (String)"etendardRohanBas");
        
        etendardRohanFin = new Etendard("etendardRohanFin", "modsda:etendard_rohan_fin");
        GameRegistry.registerBlock((Block)etendardRohanFin, (String)"etendardRohanFin");
        
        etendardGondorHaut = new Etendard("etendardGondorHaut", "modsda:etendard_gondor_haut");
        GameRegistry.registerBlock((Block)etendardGondorHaut, (String)"etendardGondorHaut");
        
        etendardGondorMilieu = new Etendard("etendardGondorMilieu", "modsda:etendard_gondor_milieu");
        GameRegistry.registerBlock((Block)etendardGondorMilieu, (String)"etendardGondorMilieu");
        
        etendardGondorBas = new Etendard("etendardGondorBas", "modsda:etendard_gondor_bas");
        GameRegistry.registerBlock((Block)etendardGondorBas, (String)"etendardGondorBas");
        
        etendardGondorFin = new Etendard("etendardGondorFin", "modsda:etendard_gondor_fin");
        GameRegistry.registerBlock((Block)etendardGondorFin, (String)"etendardGondorFin");
       
        etendardEreborFin = new Etendard("etendardEreborFin", "modsda:etendard_erebor_fin");
        GameRegistry.registerBlock((Block)etendardEreborFin, (String)"etendardEreborFin");
        
        carpentryFirst = new MuralDecoration("carpentryFirst", "modsda:carpentry_first");
        GameRegistry.registerBlock((Block)carpentryFirst, (String)"carpentryFirst");
        
        carpentrySecond = new MuralDecoration("carpentrySecond", "modsda:carpentry_second");
        GameRegistry.registerBlock((Block)carpentrySecond, (String)"caprentrySecond");
       
        masonryFirst = new MuralDecoration("masonryFirst", "modsda:masonry");
        GameRegistry.registerBlock((Block)masonryFirst, (String)"masonryFirst");
        
        masonryBis = new MuralDecoration("masonryBis", "modsda:masonry_bis");
        GameRegistry.registerBlock((Block)masonryBis, (String)"masonryBis");
        
        masonryTer = new MuralDecoration("masonryTer", "modsda:masonry_ter");
        GameRegistry.registerBlock((Block)masonryTer, (String)"masonryTer");
        
        lanceBas = new MuralDecoration("lanceBas", "modsda:lanceBas");
        GameRegistry.registerBlock((Block)lanceBas, (String)"lanceBas");
       
        lanceHaut = new MuralDecoration("lanceHaut", "modsda:lanceHaut");
        GameRegistry.registerBlock((Block)lanceHaut, (String)"lanceHaut");
       
        lanceHaut2 = new MuralDecoration("lanceHaut2", "modsda:lanceHaut2");
        GameRegistry.registerBlock((Block)lanceHaut2, (String)"lanceHaut2");
       
        lanceHaut3 = new MuralDecoration("lanceHaut3", "modsda:lanceHaut3");
        GameRegistry.registerBlock((Block)lanceHaut3, (String)"lanceHaut3");
       
        lanceHaut4 = new MuralDecoration("lanceHaut4", "modsda:lanceHaut4");
        GameRegistry.registerBlock((Block)lanceHaut4, (String)"lanceHaut4");
       
        bloodStain = new FloorDecoration(Material.water, "bloodStain", "modsda:tacheSang", 1);
        
        torchAngmar = new Torch("torchAngmar", "modsda:torch_angmar");
        GameRegistry.registerBlock((Block)torchAngmar, (String)"torchAngmar");
       
        torchDwarf = new Torch("torchDwarf", "modsda:torch_dwarf");
        GameRegistry.registerBlock((Block)torchDwarf, (String)"torchDwarf");
       
        torchDark = new Torch("torchDark", "modsda:torch_dark");
        GameRegistry.registerBlock((Block)torchDark, (String)"torchDark");
        
        
        
        
        
        //HERBES
        
        brownGrassShort = new Grass("brownGrassShort", "modsda:browngrassshort");
        GameRegistry.registerBlock((Block)brownGrassShort, (String)"brownGrassShort");
        
        brownGrassTall = new Grass("brownGrassTall", "modsda:browngrasstall");
        GameRegistry.registerBlock((Block)brownGrassTall, (String)"brownGrassTall");
        
        deadGrassShort = new Grass("deadGrassShort", "modsda:deadgrassshort");
        GameRegistry.registerBlock((Block)deadGrassShort, (String)"deadGrassShort");
        
        deadGrassTall = new Grass("deadGrassTall", "modsda:deadgrasstall");
        GameRegistry.registerBlock((Block)deadGrassTall, (String)"deadGrassTall");
        
        deadGrassYellow = new Grass("deadGrassYellow", "modsda:deadgrassyellow");
        GameRegistry.registerBlock((Block)deadGrassYellow, (String)"deadGrassYellow");
        
        lavande = new Flower("lavande", "modsda:lavender");
        GameRegistry.registerBlock((Block)lavande, (String)"lavande");
        
        iris = new Flower("iris", "modsda:iris");
        GameRegistry.registerBlock((Block)iris, (String)"iris");
        
        driedVine = new Vine("driedVine", "modsda:dried_vine");
        GameRegistry.registerBlock((Block)driedVine, (String)"driedVine");
        
        sandPile = new SandPile("sand");
        GameRegistry.registerBlock((Block)sandPile, (String)"sandPile");
       

        
        
        
        
        //ARMES
        
        legendaryEvilSword = new BasicSword("legendaryEvilSword", "modsda:legendary_evil_sword", 4.0f, 10000);
        GameRegistry.registerItem((Item)legendaryEvilSword, (String)"legendaryEvilSword");
        
        legendaryDragonSword = new BasicSword("legendaryDragonSword", "modsda:legendary_dragon_sword", 4.0f, 10000);
        GameRegistry.registerItem((Item)legendaryDragonSword, (String)"legendaryDragonSword");
        
        legendaryHumanSword = new BasicSword("legendaryHumanSword", "modsda:legendary_human_sword", 4.0f, 10000);
        GameRegistry.registerItem((Item)legendaryHumanSword, (String)"legendaryHumanSword");
        
        isengardSwordIronUsed = new BasicSword("isengardBasicSwordIronUsed", "modsda:isengard_sword_iron_used", 4.0f, 200);
        GameRegistry.registerItem((Item)isengardSwordIronUsed, (String)"isengardBasicSwordUsedIron");
        
        isengardSwordIron = new BasicSword("isengardBasicIronSword", "modsda:isengard_sword_iron", 4.0f, 200);
        GameRegistry.registerItem((Item)isengardSwordIron, (String)"isengardBasicSwordIron");
        
        isengardSwordAlloyUsed = new BasicSword("isengardBasicSwordAlloyUsed", "modsda:isengard_sword_alloy", 6.0f, 300);
        GameRegistry.registerItem((Item)isengardSwordAlloyUsed, (String)"isengardBasicSwordAlloyUsed");
        
        isengardSwordAlloy = new BasicSword("isengardBasicSwordAlloy", "modsda:isengard_sword_alloy_used", 6.0f, 300);
        GameRegistry.registerItem((Item)isengardSwordAlloy, (String)"isengardBasicSwordAlloy");
        
        isengardAxeBoss = new BasicAxe("isengardAxeBoss", "modsda:isengard_axe_boss", 20.0f, 1000);
        GameRegistry.registerItem((Item)isengardAxeBoss, (String)"isengardAxeBoss");
       
        isengardAxeBossHand = new BasicAxe("isengardAxeBossHand", "modsda:isengard_axe_boss_hand", 20.0f, 1000);
        GameRegistry.registerItem((Item)isengardAxeBossHand, (String)"isengardAxeBossHand");
       
        isengardAxeGraded = new BasicAxe("isengardAxeGraded", "modsda:isengard_axe_graded", 15.0f, 8000);
        GameRegistry.registerItem((Item)isengardAxeGraded, (String)"isengardAxeGraded");
       
        isengardBowBoss = new BasicBow("isengardBow", "modsda:isengard_bow_boss", 10000, 5.0f);
        GameRegistry.registerItem((Item)isengardBowBoss, (String)"isengardBowBoss");
        
        isengardSwordBoss = new BasicSword("isengardSwordBoss", "modsda:isengard_sword_boss", 20.0f, 1000);
        GameRegistry.registerItem((Item)isengardSwordBoss, (String)"isengardSwordBoss");
        
        isengardTorch = new BasicAxe("isengardTorch", "modsda:isengard_torch", 20.0f, 1000);
        GameRegistry.registerItem((Item)isengardTorch, (String)"isengardTorch");
       
        angmarSwordBoss = new BasicSword("angmarSwordBoss", "modsda:angmar_sword_boss", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarSwordBoss, (String)"angmarSwordBoss");
        
        angmarSpearBoss = new BasicSpear("angmarSpearBoss", "modsda:angmar_spear_boss", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarSpearBoss, (String)"angmarSpearBoss");
        
        angmarSpearUngraded = new BasicSpear("angmarSpearUngraded", "modsda:angmar_spear_ungraded", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarSpearUngraded, (String)"angmarSpearUngraded");
       
        angmarAxeGraded = new BasicAxe("angmarAxeGraded", "modsda:angmar_axe_graded", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarAxeGraded, (String)"angmarAxeGraded");
       
        angmarSwordGraded = new BasicSword("angmarSwordGraded", "modsda:angmar_sword_graded", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarSwordGraded, (String)"angmarSwordGraded");
      
        angmarSwordGradedBis = new BasicSword("angmarSwordGradedBis", "modsda:angmar_sword_graded_bis", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarSwordGradedBis, (String)"angmarSwordGradedBis");
        
        angmarBec = new BasicAxe("angmarBec", "modsda:angmar_bec", 4.0f, 200);
        GameRegistry.registerItem((Item)angmarBec, (String)"angmarBec");
        
        dunAxe = new BasicAxe("dunAxe", "modsda:dun_axe", 4.0f, 8000);
        GameRegistry.registerItem((Item)dunAxe, (String)"dunAxe");
        
        dunAxeBis = new BasicAxe("dunAxeBis", "modsda:dun_axe_bis", 4.0f, 8000);
        GameRegistry.registerItem((Item)dunAxeBis, (String)"dunAxeBis");
        
        dunAxeBoss = new BasicAxe("dunAxeBoss", "modsda:dun_axe_boss", 4.0f, 8000);
        GameRegistry.registerItem((Item)dunAxeBoss, (String)"dunAxeBoss");
        
        ereborDague = new BasicAxe("ereborDague", "modsda:erebor_dague", 4.0f, 8000);
        GameRegistry.registerItem((Item)ereborDague, (String)"ereborDague");
        
        ereborSwordGraded = new BasicSword("ereborSwordGraded", "modsda:erebor_sword_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)ereborSwordGraded, (String)"ereborSwordGraded");
        
        ereborSwordGradedBis = new BasicSword("ereborSwordGradedBis", "modsda:erebor_sword_graded_bis", 4.0f, 8000);
        GameRegistry.registerItem((Item)ereborSwordGradedBis, (String)"ereborSwordGradedBis");
        
        gondorDague = new BasicSword("gondorDague", "modsda:gondor_dague", 4.0f, 8000);
        GameRegistry.registerItem((Item)gondorDague, (String)"gondorDague");
        
        gondorSword = new BasicSword("gondorSword", "modsda:gondor_sword", 4.0f, 8000);
        GameRegistry.registerItem((Item)gondorSword, (String)"gondorSword");
        
        ironHillsAxeGraded = new BasicAxe("ironHillsAxeGraded", "modsda:ironHills_axe_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)ironHillsAxeGraded, (String)"ironHillsAxeGraded");
        
        khazadDumAxe = new BasicAxe("khazadDumAxe", "modsda:khazadDum_axe", 4.0f, 8000);
        GameRegistry.registerItem((Item)khazadDumAxe, (String)"khazadDumAxe");
        
        khazadDumAxeDouble = new BasicAxe("khazadDumAxeDouble", "modsda:khazadDum_axe_double", 4.0f, 8000);
        GameRegistry.registerItem((Item)khazadDumAxeDouble, (String)"khazadDumAxeDouble");
        
        lorienDague = new BasicSword("lorienDague", "modsda:lorien_dague", 4.0f, 8000);
        GameRegistry.registerItem((Item)lorienDague, (String)"lorienDague");
        
        lorienSwordGraded = new BasicSword("lorienSwordGraded", "modsda:lorien_sword_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)lorienSwordGraded, (String)"lorienSwordGraded");
        
        lorienSwordUngraded = new BasicSword("lorienSwordUngraded", "modsda:lorien_sword_ungraded", 4.0f, 8000);
        GameRegistry.registerItem((Item)lorienSwordUngraded, (String)"lorienSwordUngraded");
        
        lorienSwordUngradedBis = new BasicSword("lorienSwordUngradedBis", "modsda:lorien_sword_ungraded_bis", 4.0f, 8000);
        GameRegistry.registerItem((Item)lorienSwordUngradedBis, (String)"lorienSwordUngradedBis");
       
        mirkwoodSwordBoss = new BasicSword("mirkwoodSwordBoss", "modsda:mirkwood_sword_boss", 4.0f, 8000);
        GameRegistry.registerItem((Item)mirkwoodSwordBoss, (String)"mirkwoodSwordBoss");
        
        mobBalrogSword = new BasicSword("mobBalrogSword", "modsda:mob_balrog_sword", 4.0f, 8000);
        GameRegistry.registerItem((Item)mobBalrogSword, (String)"mobBalrogSword");
        
        mordorAxeGraded = new BasicSword("mordorAxeGraded", "modsda:mordor_axe_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)mordorAxeGraded, (String)"mordorAxeGraded");
       
        mordorAxeUngraded = new BasicSword("mordorAxeUngraded", "modsda:mordor_axe_ungraded", 4.0f, 8000);
        GameRegistry.registerItem((Item)mordorAxeUngraded, (String)"mordorAxeUngraded");
        
        mordorSpearUngraded = new BasicSword("mordorSpearUngraded", "modsda:mordor_spear_ungraded", 4.0f, 8000);
        GameRegistry.registerItem((Item)mordorSpearUngraded, (String)"mordorSpearUngraded");
       
        mordorSwordBoss = new BasicSword("mordorSwordBoss", "modsda:mordor_sword_boss", 4.0f, 8000);
        GameRegistry.registerItem((Item)mordorSwordBoss, (String)"mordorSwordBoss");
        
        mordorSwordGraded = new BasicSword("mordorSwordGraded", "modsda:mordor_sword_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)mordorSwordGraded, (String)"mordorSwordGraded");
        
        nordinbadAxeBoss = new BasicAxe("nordinbadAxeBoss", "modsda:nordinbad_axe_boss", 4.0f, 8000);
        GameRegistry.registerItem((Item)nordinbadAxeBoss, (String)"nordinbadAxeBoss");
        
        rohanAxe = new BasicAxe("rohanAxe", "modsda:rohan_axe", 4.0f, 8000);
        GameRegistry.registerItem((Item)rohanAxe, (String)"rohanAxe");
        
        umbarDague = new BasicSword("umbarDague", "modsda:umbar_dague", 4.0f, 8000);
        GameRegistry.registerItem((Item)umbarDague, (String)"umbarDague");
       
        umbarSwordGraded = new BasicSword("umbarSwordGraded", "modsda:umbar_sword_graded", 4.0f, 8000);
        GameRegistry.registerItem((Item)umbarSwordGraded, (String)"umbarSwordGraded");
        
        umbarSwordUngraded = new BasicSword("umbarSwordUngraded", "modsda:umbar_sword_ungraded", 4.0f, 8000);
        GameRegistry.registerItem((Item)umbarSwordUngraded, (String)"umbarSwordUngraded");
        
        umbarSwordUngradedBis = new BasicSword("umbarSwordUngradedBis", "modsda:umbar_sword_ungraded_bis", 4.0f, 8000);
        GameRegistry.registerItem((Item)umbarSwordUngradedBis, (String)"umbarSwordUngradedBis");
       
        umbarSwordUngradedTer = new BasicSword("umbarSwordUngradedTer", "modsda:umbar_sword_ungraded_ter", 4.0f, 8000);
        GameRegistry.registerItem((Item)umbarSwordUngradedTer, (String)"umbarSwordUngradedTer");
        
        elfeBow = new BasicBow("elfeBow", "modsda:bow", 10000, 5.0f);
        GameRegistry.registerItem((Item)elfeBow, (String)"elfeBow");
        
        casque = new ItemTutoArmor(armor, 0).setUnlocalizedName("casque").setTextureName("modsda:casque").setCreativeTab(weaponTab);
        plastron = new ItemTutoArmor(armor, 1).setUnlocalizedName("plastron").setTextureName("modsda:plastron").setCreativeTab(weaponTab);
        jambiere = new ItemTutoArmor(armor, 2).setUnlocalizedName("jambiere").setTextureName("modsda:jambiere").setCreativeTab(weaponTab);
        botte = new ItemTutoArmor(armor, 3).setUnlocalizedName("botte").setTextureName("modsda:botte").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)casque, (String)"casque");
        GameRegistry.registerItem((Item)plastron, (String)"plastron");
        GameRegistry.registerItem((Item)jambiere, (String)"jambiere");
        GameRegistry.registerItem((Item)botte, (String)"botte");
        
        casque2 = new armorchain1(armor, 0).setUnlocalizedName("casque2").setTextureName("modsda:casque2").setCreativeTab(weaponTab);
        plastron2 = new armorchain1(armor, 1).setUnlocalizedName("plastron2").setTextureName("modsda:plastron2").setCreativeTab(weaponTab);
        jambiere2 = new armorchain1(armor, 2).setUnlocalizedName("jambiere2").setTextureName("modsda:jambiere2").setCreativeTab(weaponTab);
        botte2 = new armorchain1(armor, 3).setUnlocalizedName("botte2").setTextureName("modsda:botte2").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)casque2, (String)"casque2");
        GameRegistry.registerItem((Item)plastron2, (String)"plastron2");
        GameRegistry.registerItem((Item)jambiere2, (String)"jambiere2");
        GameRegistry.registerItem((Item)botte2, (String)"botte2");
        
        casque3 = new armorgold1(armor, 0).setUnlocalizedName("casque3").setTextureName("modsda:casque3").setCreativeTab(weaponTab);
        plastron3 = new armorgold1(armor, 1).setUnlocalizedName("plastron3").setTextureName("modsda:plastron3").setCreativeTab(weaponTab);
        jambiere3 = new armorgold1(armor, 2).setUnlocalizedName("jambiere3").setTextureName("modsda:jambiere3").setCreativeTab(weaponTab);
        botte3 = new armorgold1(armor, 3).setUnlocalizedName("botte3").setTextureName("modsda:botte3").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)casque3, (String)"casque3");
        GameRegistry.registerItem((Item)plastron3, (String)"plastron3");
        GameRegistry.registerItem((Item)jambiere3, (String)"jambiere3");
        GameRegistry.registerItem((Item)botte3, (String)"botte3");
       
        dard = new ItemSword(toolTuto).setUnlocalizedName("dard").setTextureName("modsda:dard").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)dard, (String)"dard");
       
        scimitar = new ItemSword(toolTuto).setUnlocalizedName("scimitar").setTextureName("modsda:scimitar").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)scimitar, (String)"scimitar");
        
        morningstar = new ItemSword(toolTuto).setUnlocalizedName("morningstar").setTextureName("modsda:morningstar").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)morningstar, (String)"morningstar");
        
        iron_sword = new ItemSword(toolTuto).setUnlocalizedName("iron_sword").setTextureName("modsda:iron_sword").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)iron_sword, (String)"iron_sword");
        
        iron_axe = new ItemSword(toolTuto).setUnlocalizedName("iron_axe").setTextureName("modsda:iron_axe").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)iron_axe, (String)"iron_axe");
       
        hammer = new ItemSword(toolTuto).setUnlocalizedName("hammer").setTextureName("modsda:hammer").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)hammer, (String)"hammer");
       
        falchion = new ItemSword(toolTuto).setUnlocalizedName("falchion").setTextureName("modsda:falchion").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)falchion, (String)"falchion");
        
        hache = new EmptyThing();
        GameRegistry.registerItem((Item)hache, (String)"hache");
        
        sword_orc_gundabad = new ItemSword(toolTuto).setUnlocalizedName("sword_orc_gundabad").setTextureName("modsda:sword_orc_gundabad").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)sword_orc_gundabad, (String)"sword_orc_gundabad");
        
        sword_morgul = new ItemSword(toolTuto).setUnlocalizedName("sword_morgul").setTextureName("modsda:sword_morgul").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)sword_morgul, (String)"sword_morgul");
       
        sword_angmar = new ItemSword(toolTuto).setUnlocalizedName("sword_angmar").setTextureName("modsda:sword_angmar").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)sword_angmar, (String)"sword_angmar");
       
        soldat_angmar = new ItemSword(toolTuto).setUnlocalizedName("soldat_angmar").setTextureName("modsda:soldat_angmar").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)soldat_angmar, (String)"soldat_angmar");
       
        generaux_angmar = new EmptyThing();
        GameRegistry.registerItem((Item)generaux_angmar, (String)"generaux_angmar");
       
        axe_gundabad = new ItemSword(toolTuto).setUnlocalizedName("axe_gundabad").setTextureName("modsda:axe_gundabad").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)axe_gundabad, (String)"axe_gundabad");
       
        sword_elfe = new ItemSword(toolTuto).setUnlocalizedName("sword_elfe").setTextureName("modsda:sword_elfe").setCreativeTab(weaponTab);
        GameRegistry.registerItem((Item)sword_elfe, (String)"sword_elfe");
       
        narya = new item("narya", "modsda:narya");
        GameRegistry.registerItem((Item)narya, (String)"narya");
        
        nenya = new item("nenya", "modsda:nenya");
        GameRegistry.registerItem((Item)nenya, (String)"nenya");
        
        ring = new item("ring", "modsda:ring");
        GameRegistry.registerItem((Item)ring, (String)"ring");
       
        
        
        
        
        
        //DIVERS        
        
        facebook = new BlocLink("facebook", "modsda:facebook", "https://www.facebook.com/pages/Les-H%C3%A9ritiers-de-la-Terre-du-Milieu/1427199844179920?fref=ts");
        GameRegistry.registerBlock((Block)facebook, (String)"facebook");
       
        youtube = new BlocLink("youtube", "modsda:youtube", "https://www.youtube.com/channel/UCkk_ws1s-QvaS9kFDeh-lCw");
        GameRegistry.registerBlock((Block)youtube, (String)"youtube");
        
        forum = new BlocLink("forum", "modsda:forum", "http://heritiersminecraft.forumserv.com/index.php");
        GameRegistry.registerBlock((Block)forum, (String)"forum");
        
        lembas = new Food(10, 0.3f, false).setTextureName("modsda:lembas").setUnlocalizedName("lembas");
        GameRegistry.registerItem((Item)lembas, (String)"lembas");
       
        biere = new Alcool(2, 0.3f, false).setTextureName("modsda:mead").setUnlocalizedName("biere");
        GameRegistry.registerItem((Item)biere, (String)"biere");
        
        rum = new Alcool(2, 0.3f, false).setTextureName("modsda:rum").setUnlocalizedName("rum");
        GameRegistry.registerItem((Item)rum, (String)"rum");
        
        whine = new Alcool(2, 0.3f, false).setTextureName("modsda:whine").setUnlocalizedName("whine");
        GameRegistry.registerItem((Item)whine, (String)"whine");
        
      
        
        
        //BRANCH
       
        branchStonebrick = new BranchRock("branchStonebrick", "modsda:b_stonebrickgrey");
        GameRegistry.registerBlock((Block)branchStonebrick, (String)"branchStonebrick");
        
        branchStonebrickwhite = new BranchRock("branchStonebrickwhite", "modsda:b_stonebrickwhite");
        GameRegistry.registerBlock((Block)branchStonebrickwhite, (String)"branchStonebrickwhite");
        
        branchStonebrickDark = new BranchRock("branchStonebrickDark", "modsda:b_stonebrickdark");
        GameRegistry.registerBlock((Block)branchStonebrickDark, (String)"branchStonebrickDark");
        
        branchStonebrickbase = new BranchRock("branchStonebrickbase", "modsda:stonebrickbase");
        GameRegistry.registerBlock((Block)branchStonebrickbase, (String)"branchStonebrickbase");
        
        branchStonebase = new BranchRock("branchStonebase", "modsda:stonebase");
        GameRegistry.registerBlock((Block)branchStonebase, (String)"branchStonebase");
        
        branchsandbrick3 = new BranchRock("branchsandbrick3", "modsda:sandbrick3");
        GameRegistry.registerBlock((Block)branchsandbrick3, (String)"branchsandbrick3");
        
        branchsandbrick2 = new BranchRock("branchsandbrick2", "modsda:sandbrick2");
        GameRegistry.registerBlock((Block)branchsandbrick2, (String)"branchsandbrick2");
        
        branchsandbrick = new BranchRock("branchsandbrick", "modsda:sandbrick");
        GameRegistry.registerBlock((Block)branchsandbrick, (String)"branchsandbrick");
        
        branchpavesand = new BranchRock("branchpavesand", "modsda:pavesand");
        GameRegistry.registerBlock((Block)branchpavesand, (String)"branchpavesand");
        
        branchorange_sandstone = new BranchRock("branchorange_sandstone", "modsda:orange_sandstone");
        GameRegistry.registerBlock((Block)branchorange_sandstone, (String)"branchorange_sandstone");
        
        branchorange_sandstone_normal = new BranchRock("branchorange_sandstone_normal", "modsda:orange_sandstone_normal");
        GameRegistry.registerBlock((Block)branchorange_sandstone_normal, (String)"branchorange_sandstone_normal");
        
        branchb_rochedale = new BranchRock("branchb_rochedale", "modsda:b_rochedale");
        GameRegistry.registerBlock((Block)branchb_rochedale, (String)"branchb_rochedale");
        
        branchb_pierredale = new BranchRock("branchb_pierredale", "modsda:b_pierredale");
        GameRegistry.registerBlock((Block)branchb_pierredale, (String)"branchb_pierredale");
        
        branchb_briquedale = new BranchRock("branchb_briquedale", "modsda:b_briquedale");
        GameRegistry.registerBlock((Block)branchb_briquedale, (String)"branchb_briquedale");
        
        branchpaille2 = new BranchRock("branchpaille2", "modsda:hay");
        GameRegistry.registerBlock((Block)branchpaille2, (String)"branchpaille2");
        
        
        
        
        

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerTileEntity((Class)FurnaceEntity.class, (String)"NewFurnaceEntity");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    static {
        armor = EnumHelper.addArmorMaterial((String)"armor", (int)25, (int[])new int[]{4, 6, 5, 4}, (int)20);
        toolTuto = EnumHelper.addToolMaterial((String)"toolTuto", (int)2, (int)854, (float)12.0f, (float)4.0f, (int)18);
        
        
        
        
        //CREATIVE TABS
        
        grassTab = new CreativeTabs("herbemod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.driedGrass);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        rocheTab = new CreativeTabs("rochemod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.blueStone);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        stairsTab = new CreativeTabs("escaliermod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.stairBriqueNoireAngmar);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        slabTab = new CreativeTabs("dallemod"){

            public ItemStack getIconItemStack() {
                return new ItemStack((Block)ModSDA.slabPierreTailleeFoncee);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        verticalSlabTab = new CreativeTabs("dalleverticalmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.verticalSlabGresTaille);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        wallTab = new CreativeTabs("muretmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.wallGresCiselle);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
       
        
        decorationTab = new CreativeTabs("decorationmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.bibliothequeBis2);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        etendardTab = new CreativeTabs("etendardmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.bannerGundabad);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
              
        
        naturalTab = new CreativeTabs("naturalmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.lavande);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        vitreTab = new CreativeTabs("vitremod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.vitreCarreQuadrille);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        colombageTab = new CreativeTabs("colombagemod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.colombageClairOgive);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        itemTab = new CreativeTabs("itemmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.hammer);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
       
        
        weaponTab = new CreativeTabs("armesmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.isengardSwordAlloyUsed);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        mineraiTab = new CreativeTabs("mineraismod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.etain);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        foodTab = new CreativeTabs("foodmod"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.lembas);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
      
        
        branchTab = new CreativeTabs("branchTab"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.branchStonebase);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
        
        
        block3DTab = new CreativeTabs("block3DTab"){

            public ItemStack getIconItemStack() {
                return new ItemStack(ModSDA.branchStonebase);
            }

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return null;
			}
        };
    	}

}

