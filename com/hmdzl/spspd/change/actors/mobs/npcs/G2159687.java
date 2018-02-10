/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.hmdzl.spspd.change.actors.mobs.npcs;


import com.hmdzl.spspd.change.Dungeon;
import com.hmdzl.spspd.change.actors.Char;
import com.hmdzl.spspd.change.actors.buffs.Buff;
import com.hmdzl.spspd.change.scenes.GameScene;
import com.hmdzl.spspd.change.sprites.G2159687Sprite;
import com.hmdzl.spspd.change.messages.Messages;
import com.hmdzl.spspd.change.windows.WndHotel;
import com.hmdzl.spspd.change.windows.WndONS;
import com.watabou.utils.Random;

public class G2159687 extends NPC {

	{
		//name = "G2159687";
		spriteClass = G2159687Sprite.class;
		properties.add(Property.UNKNOW);
	}

	@Override
	protected boolean act() {
		throwItem();
		return super.act();
	}	
	
	@Override
	public int defenseSkill(Char enemy) {
		return 1000;
	}


	@Override
	protected Char chooseEnemy() {
		return null;
	}

	@Override
	public void damage(int dmg, Object src) {
	}

	@Override
	public void add(Buff buff) {
	}

	@Override
	public boolean reset() {
		return true;
	}

   
	
	@Override
	public void interact() {
		
		sprite.turnTo(pos, Dungeon.hero.pos);
		switch (Random.Int (3)) {
            case 0:
			yell(Messages.get(this, "yell1"));	
			break;
			case 1:
				yell(Messages.get(this, "yell2"));
				break;
			case 2:
				GameScene.show(new WndHotel());
				break;
		}
	}
}